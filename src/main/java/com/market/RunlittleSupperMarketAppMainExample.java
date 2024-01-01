package com.market;

import com.market.supermarket.LittleSuperMarketV2;
import com.market.supermarket.MerchandiseV2;

import java.util.Scanner;

public class RunLittleSupperMarketAppMainExample {
    public static void main(String[] args) {
        LittleSuperMarketV2 littleSuperMarket = new LittleSuperMarketV2();
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

        // 创建一个Scanner读取
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("今日超市大特惠，所有商品第二件半价！选择要购买的商品索引：");
            int index = scanner.nextInt();
            if (index < 0) {
                System.out.println("欢迎再次光临");
                break;
            }
            if (index >= all.length) {
                System.out.println("商品索引超出界限");
                continue;
            }
            double price = littleSuperMarket.merchandises[index].purchasePrice;
            System.out.println("商品单价为" + price);
            System.out.println("请输入要买的数量：");
            int count = scanner.nextInt();

            MerchandiseV2 m = littleSuperMarket.merchandises[index];
//            double totalCost = m.buy(count);
            double totalCost = m.buyAndPrintLeft(count, true);
            System.out.println("商品总价为：" + totalCost);

        }
    }

}
