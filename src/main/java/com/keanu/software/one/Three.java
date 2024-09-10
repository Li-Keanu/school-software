package com.keanu.software.one;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  写一个命令行程序。
 *  要求：输出1~20000内的所有素数，按每行5个打印出来，并分析程序中最费时的函数是什么， 如何改进？
 * </p>
 *
 * @author <a href="https://github.com/Li-Keanu">keanu</a>
 * @since 2024/9/10 10:25
 */
public class Three {
    public static void main(String[] args) {
        printPrimeNumbers(20000);
    }

    public static void printPrimeNumbers(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
                count++;
            }
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
