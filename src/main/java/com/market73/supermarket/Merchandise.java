package com.market73.supermarket;

import java.util.Objects;

public class Merchandise {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public Merchandise(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public Merchandise() {
        this("无名", "000", 0, 1, 1.1);
    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + calculateProfit());
    }

    public double calculateProfit() {
        return soldPrice - purchasePrice;
    }

    public double buy(int count) {
        if (this.count < count) {
            System.out.println("购买失败，库存不够");
            return -1;
        }
        this.count = this.count - count;
        double cost = count * soldPrice;
        System.out.println("购买成功，花费为" + cost);
        return cost;
    }

    public double buy(boolean reallyBuy) {
        System.out.println("Merchandise里的buy(boolean reallyBuy)");
        if (reallyBuy) {
            return this.buy(1);
        } else {
            return -1;
        }
    }
    // hashCode 和 equals是我们最常覆盖的两个方法
    // 覆盖的原则是，equals为true，hashCode就应该相等。这是一种约定俗成的规范
    // 即equals为true是hashCode相等的充分非必要条件，hashCode相等是equals为true的必要不充分条件
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Merchandise)) return false;
        Merchandise that = (Merchandise) o;
        return getCount() == that.getCount() && Double.compare(getSoldPrice(), that.getSoldPrice()) == 0 && Double.compare(getPurchasePrice(), that.getPurchasePrice()) == 0 && Objects.equals(getName(), that.getName()) && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getCount(), getSoldPrice(), getPurchasePrice());
    }

    @Override
    public String toString() {
        return "Merchandise{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", count=" + count +
                ", soldPrice=" + soldPrice +
                ", purchasePrice=" + purchasePrice +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
