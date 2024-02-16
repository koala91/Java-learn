package com.market73.supermarket;

public class ShellColorChangePhone extends Phone{
    private Boolean enableShellColorChange;
    public ShellColorChangePhone(
            String name, String id, int count, double soldPrice, double purchasePrice,
            double screenSize, double cpuHz, int memoryG, int storageG, String brand, String os
    ) {
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHz, memoryG, storageG, brand, os);
        enableShellColorChange = false;
    }

    public Boolean getEnableShellColorChange() {
        return enableShellColorChange;
    }

    public void setEnableShellColorChange(Boolean enableShellColorChange) {
        this.enableShellColorChange = enableShellColorChange;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("壳色随着屏幕色变的功能开启状态：" + enableShellColorChange);
    }

    @Override
    public String toString() {
        return "ShellColorChangePhone{" +
                "enableShellColorChange=" + enableShellColorChange +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", count=" + count +
                ", soldPrice=" + soldPrice +
                ", purchasePrice=" + purchasePrice +
                '}';
    }

    public double calculateProfit() {
        // 手机不好卖，厂家提供10个点的返点
        double profit = super.calculateProfit();
        return profit + profit * 0.1;
    }
    public double buy(int count) {
        System.out.println("ShellColorChangePhone里的buy(int count)");
        if (count < 2) {
            System.out.println("买一送一了解一下，不单卖哦！");
            return -1;
        }
        return super.buy(count);
    }
}
