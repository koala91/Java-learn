package com.market73.supermarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public Merchandise[] merchandises;
    public int[] merchandiseSold;

    /**
     * 初始化小超市
     * @param superMarketName 超市名字
     * @param address 超市地址
     * @param parkingCount 超市停车位
     * @param merchandiseCount 商品种类数
     * @param count 每种商品缺省库存
     */
    public LittleSuperMarket(
            String superMarketName,
            String address,
            int parkingCount,
            int merchandiseCount,
            int count
    ) {
        this.superMarketName = superMarketName;
        this.address = address;
        this.parkingCount = parkingCount;

        merchandises = new Merchandise[merchandiseCount];
        for (int i = 0; i < merchandiseCount; i++) {
            // 创建手机，手机壳变色手机，和普通商品，都放在商品数组里
            Merchandise m = null;
            if (i > 0 & i % 100 == 0) {
                m = new ShellColorChangePhone(
                        "商品" + i,
                        "ID" + i,
                        count,
                        6999,
                        5999,
                        5.5,
                        3.5,
                        4,
                        128,
                        "苹果",
                        "IOS"
                );
            } else if (i > 0 & i % 10 == 0) {
                m = new Phone(
                        "商品" + i,
                        "ID" + i,
                        count,
                        8999,
                        7999,
                        6.5,
                        3.5,
                        4,
                        128,
                        "华为",
                        "Android"
                );
            } else {
                double purchasePrice = Math.random() * 200;
                m = new Merchandise(
                        "商品" + i,
                        "ID" + i,
                        count,
                        purchasePrice * (1 + Math.random()),
                        purchasePrice
                );
            }
//            用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
            merchandises[i] = m;
        }
        merchandiseSold = new int[merchandiseCount];
    }

    // 简单访问成员变量


    public String getSuperMarketName() {
        return superMarketName;
    }

    public void setSuperMarketName(String superMarketName) {
        this.superMarketName = superMarketName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getParkingCount() {
        return parkingCount;
    }

    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }

    public double getIncomingSum() {
        return incomingSum;
    }

    public void setIncomingSum(double incomingSum) {
        this.incomingSum = incomingSum;
    }

    public void setMerchandises(Merchandise[] merchandises) {
        this.merchandises = merchandises;
    }

    public void setMerchandiseSold(int[] merchandiseSold) {
        this.merchandiseSold = merchandiseSold;
    }

    /**
     *
     * @return 得到利润最高的商品
     */
    public Merchandise getBiggestProfitMerchandise() {
        Merchandise curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            Merchandise m = merchandises[i];
            if (curr == null || curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }

    public Merchandise getMerchandiseOf(int merchandiseIndex) {
        if (merchandiseIndex < 0 || merchandiseIndex >= merchandises.length) {
            return null;
        }
        return merchandises[merchandiseIndex];
    }
}
