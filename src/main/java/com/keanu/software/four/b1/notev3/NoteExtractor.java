package com.keanu.software.four.b1.notev3;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

import java.io.IOException;
import java.io.StringReader;
import java.util.Objects;

import static org.third.noteV3.Event.*;


/**
 * @author tiger
 * @date 2023-11-03 20:50
 */
public class NoteExtractor {

    /**
     * 状态动作对
     */
    private class Pair{
        private State state;
        private Action action;

        Pair(State state, Action action) {
            this.state = state;
            this.action = action;
        }
    }
    // 当前状态
    private State currentState = State.look_for_string;
    // 结果
    private final StringBuilder result = new StringBuilder();
    /**
     * 返回结果
     * @return 返回抽取字符串
     */
    public String getResult() {
        return result.toString();
    }
    // 状态变换表
    private final Table<State, Event, Pair> TRANSITIONS = ImmutableTable.<State, Event, Pair>builder()
            .put(State.look_for_string,DOUBLE_QUOTATION, new Pair(State.in_string, Action.start_new_string))
            .put(State.look_for_string,OTHER_CHAR,new Pair(State.look_for_string, Action.ignore))
            .put(State.in_string,DOUBLE_QUOTATION,new Pair(State.look_for_string, Action.finish_current_string))
            .put(State.in_string,BACK_SLASH,new Pair(State.copy_next_char, Action.ignore))
            .put(State.in_string,OTHER_CHAR,new Pair(State.in_string, Action.add_current_to_string))
            .put(State.copy_next_char,OTHER_CHAR,new Pair(State.in_string, Action.add_current_to_string))
            .build();

    /**
     * 触发事件响应
     * @param ch 当前字符
     */
    public void trigger(char ch) {
        Event event = Event.of(String.valueOf(ch));
        // 获取状态变换
        Pair pair = TRANSITIONS.get(currentState, event);
        if (Objects.isNull(pair)) {
            pair = TRANSITIONS.get(currentState, OTHER_CHAR);
        }
        currentState = pair.state;
        doIt(pair.action,ch);

    }

    /**
     * 执行动作
     * @param action 动作
     * @param currentChar 当前字符
     */
    private void doIt(Action action,char currentChar) {
        switch (action) {
            case ignore:
                break;
            case start_new_string: {
                result.setLength(0);
                break;
            }
            case add_current_to_string:{
                result.append(currentChar);
                break;
            }
            case finish_current_string:{
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 解析示例
        String source = "老师说，\"一般学习程序设计的第一个程序就是\\\"Hello,World!\\\"\"";
        NoteExtractor extractor = new NoteExtractor();

        // 执行状态转换
        StringReader reader = new StringReader(source);
        int ch;
        while ((ch = reader.read()) != -1) {
            extractor.trigger((char) ch);
        }

        String result = extractor.getResult();
        System.out.println(result);
    }

}
