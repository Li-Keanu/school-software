package com.keanu.software.one;

/**
 * <p>
 *  写一个命令行程序。
 *  要求：输出1~20000内的所有素数，按每行5个打印出来，并分析程序中最费时的函数是什么， 如何改进？
 * </p>
 *
 * <p>
 *      最费时的函数是 isPrime 函数，因为它需要迭代从 2 到 Math.sqrt(num) 的所有数字，
 *  并检查是否能被 num 整除。该函数的时间复杂度为 O(sqrt(n))，随着数字的增加，
 *  该函数的执行时间也会增加。
 *      只需要检查num % i == 0的情况，其中i为不大于 Math.sqrt(num) 的素数。
 *  这是因为如果存在一个大于 Math.sqrt(num) 的因子，那么必然存在一个小于 Math.sqrt(num) 的因子。
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
