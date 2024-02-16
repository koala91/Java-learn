package com.market73.supermarket;

public class Phone extends  Merchandise{
    private double screenSize;
    private double cpuHz;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;
    private static int MAX_BUY_ONE_ORDER = 5;

    public Phone(
            String name, String id, int count, double soldPrice, double purchasePrice,
            double screenSize, double cpuHz, int memoryG, int storageG, String brand, String os
    ) {
        super(name, id, count, soldPrice, purchasePrice);
        this.screenSize = screenSize;
        this.cpuHz = cpuHz;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;
    }

    public double buy(int count) {
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }
        return  super.buy(count);
    }
//    下面getName方法注释了，10和100的商品就可以相等了
//    public String getName () {
//        return this.brand + ":" + this.os + ":" + super.getName();
//    }

    public void describe() {
        System.out.println("此手机商品属性如下");
        super.describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
                "屏幕：" + screenSize + "寸\n" +
                "cpu主频" + cpuHz + " GHz\n" +
                "内存" + memoryG + "Gb\n" +
                "存储空间" + storageG + "Gb");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", cpuHz=" + cpuHz +
                ", memoryG=" + memoryG +
                ", storageG=" + storageG +
                ", brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", count=" + count +
                ", soldPrice=" + soldPrice +
                ", purchasePrice=" + purchasePrice +
                '}';
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCpuHz() {
        return cpuHz;
    }

    public void setCpuHz(double cpuHz) {
        this.cpuHz = cpuHz;
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
