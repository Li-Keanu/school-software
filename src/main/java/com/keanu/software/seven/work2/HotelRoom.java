package com.keanu.software.seven.work2;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href="https://github.com/Li-Keanu">keanu</a>
 * @since 2024/12/3 11:09
 */
public abstract class HotelRoom {
    protected DiscountStrategy discountStrategy;

    public HotelRoom(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice(double originalPrice) {
        return discountStrategy.calculateDiscount(originalPrice);
    }
}
