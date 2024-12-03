package com.keanu.software.seven.work2;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href="https://github.com/Li-Keanu">keanu</a>
 * @since 2024/12/3 11:11
 */
public class Client {
    public static void main(String[] args) {
        HotelRoom standardRoomForNormalUser = new StandardRoom(new FullPriceStrategy());
        System.out.println("Standard Room for Normal User: " + standardRoomForNormalUser.calculatePrice(100));

        HotelRoom standardRoomForGoldUser = new StandardRoom(new GoldDiscountStrategy());
        System.out.println("Standard Room for Gold User: " + standardRoomForGoldUser.calculatePrice(100));

        HotelRoom standardRoomForSilverUser = new StandardRoom(new SilverDiscountStrategy());
        System.out.println("Standard Room for Silver User: " + standardRoomForSilverUser.calculatePrice(100));
    }
}
