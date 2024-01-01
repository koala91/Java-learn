package com.market;

import com.market.person.Customer;
import com.market.supermarket.LittleSuperMarket;
import com.market.supermarket.Merchandise;
import com.market.supermarket.MerchandiseV2;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "世纪大道666号";
        littleSuperMarket.superMarketName = "有家超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new MerchandiseV2[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        MerchandiseV2[] all = littleSuperMarket.merchandises;
        for (int i = 0; i < all.length; i++) {
            MerchandiseV2 m = new MerchandiseV2();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }

        System.out.println("下面请利润最高的商品自我介绍：");
        littleSuperMarket.getBiggestProfitMerchandise().describe();





    }
}
