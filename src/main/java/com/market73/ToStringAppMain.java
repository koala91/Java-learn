package com.market73;

import com.market73.supermarket.LittleSuperMarket;
import com.market73.supermarket.Merchandise;

public class ToStringAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        Merchandise m100 = superMarket.getMerchandiseOf(100);

        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append("商品100是：").append(m100);

        // 因为toString是Object里的方法，所以任何一个Java的对象，都可以调用这个方法

        System.out.println(strBuilder.toString());
        System.out.println(m100);
    }
}
