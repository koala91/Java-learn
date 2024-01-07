package com.market;

import com.market.supermarket.LittleSuperMarketV2;
import com.market.supermarket.MerchandiseV2;

public class RunLittleSupperMarketAppMain2 {
    public static void main(String[] args) {
        LittleSuperMarketV2 littleSuperMarket = new LittleSuperMarketV2();
        littleSuperMarket.init("有家超市", "世纪大道666号", 100, 200, 200);

        System.out.println("下面请利润最高的商品自我介绍：");
        littleSuperMarket.getBiggestProfitMerchandise().describe();
    }
}
