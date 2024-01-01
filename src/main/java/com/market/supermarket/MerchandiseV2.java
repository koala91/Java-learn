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
}
