package com.keanu.software.four.b1.themostate;

/**
 * @author tiger
 * @date 2023-10-16 21:05
 */
enum State {
    /**
     * 电源关闭状态
     */
    OFF("OFF","电源关闭状态"),
    /**
     * 电源接通状态
     */
    ON("ON","电源接通状态"),
    /**
     * 坏掉
     */
    BURNING_OUT("BURNING_OUT", "烧坏状态");
    private String name;
    private String value;

    State(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
