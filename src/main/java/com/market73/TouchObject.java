package com.market73;

import com.market73.supermarket.LittleSuperMarket;

public class TouchObject {
    public static void main(String[] args) {
        Object obj = new Object();
        printObj(obj);

        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号",
                500,
                600,
                100);

        printObj(superMarket);
        printObj(superMarket.getMerchandiseOf(0));
        printObj(superMarket.getMerchandiseOf(10));
        printObj(superMarket.getMerchandiseOf(100));
    }
    private static void printObj(Object obj) {
        System.out.println("-------" + obj + "的详细内容--------");
        System.out.println(obj);
//        看实现
        System.out.println(obj.toString());
//        native方法
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
    }
}
