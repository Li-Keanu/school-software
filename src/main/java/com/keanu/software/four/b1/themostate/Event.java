package com.keanu.software.four.b1.themostate;

/**
 * @author tiger
 * @date 2023-10-16 21:06
 */
enum Event {
    /**
     * 当温度达到最低临界温度LOW时，打开电源
     */
    turnOn,
    /**
     * 当温度达到最高临界温度HIGH,切断电源
     */
    turnOff,
    /**
     * 烧坏
     */
    burningOut
}