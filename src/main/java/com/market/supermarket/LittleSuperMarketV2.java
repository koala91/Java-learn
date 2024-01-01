package com.market.supermarket;

public class LittleSuperMarketV2 {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2 [] merchandises;
    public int[] merchandiseSold;

    //    返回值可以是类名，实际返回值就是这个类的引用
    public MerchandiseV2 getBiggestProfitMerchandise() {
        MerchandiseV2 curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = merchandises[i];
            if (curr == null) {
                curr = m;
                continue;
            }
            if (curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return  curr;
    }
}
