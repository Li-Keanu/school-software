package com.keanu.software.seven.work1;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href="https://github.com/Li-Keanu">keanu</a>
 * @since 2024/12/3 10:55
 */
public class UnableSwim implements SwimBehavior{
    @Override
    public void swim() {
        System.out.println("扑腾几下就淹死了");
    }
}
