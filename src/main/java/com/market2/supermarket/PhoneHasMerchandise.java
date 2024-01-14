package com.market2.supermarket;

public class PhoneHasMerchandise {
    // 给phone增加新的属性和方法
    private double screenSize;
    private double cupHZ;
    private int memoryG;
    private int storageG;
    private  String brand;
    private String os;
    // 组合
    private Merchandise merchandise;

    public PhoneHasMerchandise (
            double screenSize,
            double cupHZ,
            int memoryG,
            int storageG,
            String brand,
            String os,
            Merchandise merchandise
    ) {
        this.screenSize = screenSize;
        this.cupHZ = cupHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;
        this.merchandise = merchandise;
    }

    public void describePhone() {
        System.out.println("此手机商品属性如下");
        merchandise.describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + ";硬件配置如下：\n" + "屏幕：" + screenSize + "寸\n" + "cpu主频" + cupHZ + "GHz\n" + "内存" + memoryG + "Gb\n" + "存储空间" + storageG + "Gb\n");
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
    public Merchandise getMerchandise () {
        return merchandise;
    }

    public void setMerchandise(Merchandise merchandise) {
        this.merchandise = merchandise;
    }
}
