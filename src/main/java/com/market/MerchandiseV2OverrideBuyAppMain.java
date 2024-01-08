package com.market;

import com.market.supermarket.MerchandiseV2Overload;

import static com.market.supermarket.MerchandiseV2Overload.DISCOUNT_FOR_VIP;
import static com.market.supermarket.MerchandiseV2Overload.getDiscountForVip;

public class MerchandiseV2OverrideBuyAppMain {
    public static void main(String[] args) {
        MerchandiseV2Overload merchandise = new MerchandiseV2Overload();

        merchandise.init("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.buy();
        merchandise.describe();

        double cost = merchandise.buy(10);
        System.out.println(cost);
        merchandise.describe();

        System.out.println(DISCOUNT_FOR_VIP);
        double costVip = merchandise.buy(10, true);
        System.out.println(costVip);
        merchandise.describe();

        DISCOUNT_FOR_VIP = 0.5; // 更改静态变量的值，后续都会跟着变
        double costVip2 = merchandise.buy(10, true);
        System.out.println(costVip2);
        merchandise.describe();

        System.out.println("新商品");
        MerchandiseV2Overload merchandise2 = new MerchandiseV2Overload();
        merchandise2.init("书桌2", "DESK9528", 40, 200, 100);
        double costVip3 = merchandise2.buy(10, true);
        System.out.println(costVip3);
        merchandise2.describe();

//        引入静态方法并调用
        System.out.println(getDiscountForVip());




    }
}
