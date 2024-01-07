package com.market.supermarket;

public class MerchandiseV2WithConstructor {
    public  String name;
    public  String id;
    public  int count;
    public double soldPrice;
    public double purchasePrice;

//    构造方法的方法名必须和类名一样，而且构造方法没有返回值，这样的方法才是构造方法

    public MerchandiseV2WithConstructor(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public MerchandiseV2WithConstructor(String name, String id, int count, double soldPrice) {
        this(name, id, count, soldPrice, soldPrice * 0.8);
    }

    public MerchandiseV2WithConstructor() {
        this("无名", "000", 0, 1, 1.1);
    }


    public void describe() {
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品名字叫做" + name + ",id是" + id + "。商品售价是" + soldPrice + "。商品进价是" + purchasePrice + "。商品的库存是" + count + "。商品单个的毛利润是" + netIncome);
    }

}
