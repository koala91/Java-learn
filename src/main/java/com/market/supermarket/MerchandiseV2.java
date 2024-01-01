package com.market.supermarket;

public class MerchandiseV2 {
    public  String name;
    public  String id;
    public  int count;
    public double soldPrice;
    public double purchasePrice;

//    方法
    public void describe() {
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品名字叫做" + name + ",id是" + id + "。商品售价是" + soldPrice + "。商品进价是" + purchasePrice + "。商品的库存是" + count + "。商品单个的毛利润是" + netIncome);
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        if (profit <= 0) {
            return  0;
        }
        return  profit;
    }

    public double getCurrentCount() {
        return  count;
    }

    public  int getIntSoldPrice() {
        return (int) soldPrice;
    }

    public double buy(int countToBuy) {
        if (count < countToBuy) {
            System.out.println("商品库存不足");
            return -1;
        }
        System.out.println("商品单价为：" + purchasePrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2; // 全价数量
        int halfPriceCount = countToBuy - fullPriceCount; // 半价数量
        double totalCost = purchasePrice * fullPriceCount + halfPriceCount * purchasePrice / 2;

        count = count - countToBuy;
        return  totalCost;
    }

    public double buyAndPrintLeft(int countToBuy, boolean printLeft) {
        if (count < countToBuy) {
            System.out.println("商品库存不足");
            if (printLeft) {
                System.out.println("商品库存为：" + count);
            }
            return -1;
        }
        System.out.println("商品单价为：" + purchasePrice);
        int fullPriceCount = countToBuy / 2 + countToBuy % 2; // 全价数量
        int halfPriceCount = countToBuy - fullPriceCount; // 半价数量
        double totalCost = purchasePrice * fullPriceCount + halfPriceCount * purchasePrice / 2;

        count = count - countToBuy;
        if (printLeft) {
            System.out.println("商品剩余库存为：" + count);
        }
        return  totalCost;
    }

    // 函数的参数可以是任何类型，包括自定义类型。
}
