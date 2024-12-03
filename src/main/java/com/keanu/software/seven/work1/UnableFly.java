package com.keanu.software.seven.work1;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href="https://github.com/Li-Keanu">keanu</a>
 * @since 2024/12/3 10:53
 */
public class UnableFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("扑腾几下飞不起来");
    }
}
