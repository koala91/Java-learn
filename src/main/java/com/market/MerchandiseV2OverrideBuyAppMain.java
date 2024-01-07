package com.market;

import com.market.supermarket.MerchandiseV2Overload;

public class MerchandiseV2OverrideBuyAppMain {
    public static void main(String[] args) {
        MerchandiseV2Overload merchandise = new MerchandiseV2Overload();

        merchandise.init("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.buy();
        merchandise.describe();

        double cost = merchandise.buy(10);
        System.out.println(cost);
        merchandise.describe();

        double costVip = merchandise.buy(10, true);
        System.out.println(costVip);
        merchandise.describe();
    }
}
