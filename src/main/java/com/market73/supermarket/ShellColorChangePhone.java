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

    public double calculateProfit() {
        // 手机不好卖，厂家提供10个点的返点
        double profit = super.calculateProfit();
        return profit + profit * 0.1;
    }
}
