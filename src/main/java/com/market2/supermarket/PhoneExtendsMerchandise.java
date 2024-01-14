package com.market2.supermarket;

public class PhoneExtendsMerchandise extends Merchandise{
//    子类继承父类的所有属性和方法
    private double screenSize;
    private double cupHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;
    private static int MAX_BUY_ONE_ORDER = 5; // 最多购买5个

    public PhoneExtendsMerchandise(
            String name,
            String id,
            int count,
            double soldPrice,
            double purchasePrice,
            double screenSize,
            double cupHZ,
            int memoryG,
            int storageG,
            String brand,
            String os
    ) {
        this.screenSize = screenSize;
        this.cupHZ = cupHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
    }

//    覆盖

    @Override
    public double buy(int count) {
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能购买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }
        return super.buy(count);
    }

    @Override
    public String getName() {
        return this.brand + "：" + this.os + "：" + name;
    }

    public void describe() {
        System.out.println("此商品属性如下：");
        super.describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + ";硬件配置如下：\n" + "屏幕：" + screenSize + "寸\n" + "cpu主频" + cupHZ + "GHz\n" + "内存" + memoryG + "Gb\n" + "存储空间" + storageG + "Gb\n");
    }

    public PhoneExtendsMerchandise getThisPhone () {
        return this;
    }
//    使用super可以调用父类的public属性
    public void accessParentProps() {
        System.out.println("父类的name属性：" + super.name);
    }

    public void useSuper () {
        super.describe();
        super.buy(66);
        System.out.println("父类的count属性" + super.count);
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCupHZ() {
        return cupHZ;
    }

    public void setCupHZ(double cupHZ) {
        this.cupHZ = cupHZ;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(int memoryG) {
        this.memoryG = memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
