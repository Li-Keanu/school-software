package com.keanu.software.seven.work2;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href="https://github.com/Li-Keanu">keanu</a>
 * @since 2024/12/3 11:09
 */
public class SilverDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(double originalPrice) {
        return originalPrice * 0.9;
    }
}
