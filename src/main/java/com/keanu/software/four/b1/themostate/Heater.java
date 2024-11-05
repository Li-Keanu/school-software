package com.keanu.software.four.b1.themostate;

import com.github.oxo42.stateless4j.StateMachine;
import com.github.oxo42.stateless4j.StateMachineConfig;

/**
 * @author tiger
 * @date 2023-10-16 20:18
 */
public class Heater {

    private StateMachineConfig<State, Event> config;

    private GuardCondition guardCondition = new GuardCondition();
    private StateMachine<State, Event> stateMachine;

    public Heater() {
        init();
    }

    public void init() {
        guardCondition.setEmpty(false);

        // 创建状态机配置
        config = new StateMachineConfig<>();

        // 定义状态转换规则
        config.configure(State.OFF)
                .permitIf(Event.turnOn, State.ON, guardCondition.hasWater(),new StartHeaterAction())
                .ignoreIf(Event.turnOn, guardCondition.isEmpty())
                .ignore(Event.turnOff);

        config.configure(State.ON)
                .permit(Event.turnOff, State.OFF,new StopHeaterAction())
                .ignore(Event.turnOn)
                .permit(Event.burningOut,State.BURNING_OUT);

        config.configure(State.BURNING_OUT)
                .ignore(Event.turnOn)
                .ignore(Event.turnOff)
                .ignore(Event.burningOut);

        // 创建状态机实例
        stateMachine = new StateMachine<>(State.OFF, config);
    }

    public void setEmptyWater(boolean empty) {
        this.guardCondition.setEmpty(empty);
    }
    public void fire(Event event) {
        this.stateMachine.fire(event);
    }

    public State getCurrentState() {
        return this.stateMachine.getState();
    }
    public void printCurrentState() {
        System.out.println("Current State: " + stateMachine.getState());
    }

}
