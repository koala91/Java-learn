package com.market73;

import com.market73.supermarket.LittleSuperMarket;
import com.market73.supermarket.Merchandise;

public class OverloadAndOverrideTestAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket(
                "大卖场",
                "世纪大道1号",
                500,
                600,
                100);
        Merchandise m = superMarket.getMerchandiseOf(100);

        // 分别用true， 1， 3， 6做参数，运行结果是什么，为什么？
        System.out.println("-----------true-------------");
        m.buy(true);
        System.out.println("-----------1-------------");
        m.buy(1);
        System.out.println("-----------2-------------");
        m.buy(2);
        System.out.println("-----------3-------------");
        m.buy(3);
        System.out.println("-----------6-------------");
        m.buy(6);
    }
}
