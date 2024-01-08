package com.market.supermarket;

public class MerchandiseV2Overload {
    public  String name;
    public  String id;
    public  int count;
    public double soldPrice;
    public double purchasePrice;
    public static double DISCOUNT_FOR_VIP = 0.95; // 静态变量（在整个java程序中只有一个，一旦变化，所有用到的地方都变化）

//    静态方法使用static修饰符(名字不需要约定成俗全大写。没this)
    public static double getDiscountForVip() {
        return DISCOUNT_FOR_VIP;
    }

    public void init(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public void describe() {
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品名字叫做" + name + ",id是" + id + "。商品售价是" + soldPrice + "。商品进价是" + purchasePrice + "。商品的库存是" + count + "。商品单个的毛利润是" + netIncome);
    }
    public double buy() {
        return buy(1);
    }

//    像这种补充一些缺省的参数值，然后调用重载的方法，是重载的一个重要使用场景。
    public double buy(int count) {
        return buy(count, false);
    }
    public double buy(int count, boolean isVip) {
        if (this.count < count) {
            return -1;
        }
        this.count = this.count - count;
        double totalCost = count * soldPrice;
        if (isVip) {
            return totalCost * DISCOUNT_FOR_VIP;
        } else {
             return totalCost;
        }
    }
}
