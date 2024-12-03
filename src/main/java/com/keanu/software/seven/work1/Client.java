package com.keanu.software.seven.work1;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href="https://github.com/Li-Keanu">keanu</a>
 * @since 2024/12/3 10:36
 */
public class Client {
    public Client() {

    }

    public static void main(String[] args) {
        UnableFly unableFly = new UnableFly();
        unableFly.fly();

        AbleSwim ableSwim = new AbleSwim();
        ableSwim.swim();

        UnableSwim unableSwim = new UnableSwim();
        unableSwim.swim();

        Eagle eagle = new Eagle();
        eagle.display();

        Penguin penguin = new Penguin();
        penguin.display();
    }
}
