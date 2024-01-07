package com.market.supermarket;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
//        MerchandiseV2 merchandise = new MerchandiseV2();
//
//        merchandise.init("书桌", "DESK123", 40, 999.9, 500);
        MerchandiseV2WithConstructor merchandise = new MerchandiseV2WithConstructor("书桌", "DESK123", 40, 999.9, 500);

        merchandise.describe();
    }
}
