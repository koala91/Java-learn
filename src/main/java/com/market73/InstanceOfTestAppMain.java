package com.market73;

import com.market73.supermarket.LittleSuperMarket;
import com.market73.supermarket.Merchandise;

public class InstanceOfTestAppMain {
    public static void main(String[] args) {
        int merchandiseCount = 101;
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号",
                500,
                merchandiseCount,
                100);
        //  instanceof 操作符，可以判断一个引用指向的对象是否是某一个类型或者其子类
        // 是则返回true，否则返回false
        for (int i = 0; i < merchandiseCount; i++) {
            Merchandise m = superMarket.getMerchandiseOf(i);
            if (m instanceof Merchandise) {
                Merchandise ph = (Merchandise) m;
                System.out.println(ph.getName());
            } else {
//                System.out.println("not an instance");
            }
        }
    }
}
