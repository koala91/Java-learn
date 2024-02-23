package com.market96.supermarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public Merchandise[] merchandises;
    public int[] merchandiseSold;

    /**
     *
     * @param superMarketName 超市名字
     * @param address 地址
     * @param parkingCount 停车位
     * @param merchandiseCount 商品种类数
     * @param count 每种商品缺省库存
     */
    public LittleSuperMarket(String superMarketName, String address, int parkingCount,
                             int merchandiseCount, int count) {
        this.superMarketName = superMarketName;
        this.address = address;
        this.parkingCount = parkingCount;

        merchandises = new Merchandise[merchandiseCount];
        for (int i = 0; i < merchandises.length; i++) {
            double purchasePrice = Math.random() * 200;
            // 创建并给商品的属性赋值
            Merchandise m = new Merchandise(
                    "商品" + i,
                    "ID" + i,
                    count,
                    purchasePrice * (1 + Math.random()),
                    purchasePrice
            );
            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
            merchandises[i] = m;
        }
        merchandiseSold = new int[merchandises.length];
    }

    // 简单的访问成员变量

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

    public Merchandise[] getMerchandises() {
        return merchandises;
    }

    public void setMerchandises(Merchandise[] merchandises) {
        this.merchandises = merchandises;
    }

    public int[] getMerchandiseSold() {
        return merchandiseSold;
    }

    public void setMerchandiseSold(int[] merchandiseSold) {
        this.merchandiseSold = merchandiseSold;
    }

    // 一些特殊的逻辑

    /**
     *
     * @return 得到利润最高的商品
     */
    public Merchandise getBiggestProfitMerchandise() {
        Merchandise curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            Merchandise m = merchandises[i];
            // 这个逻辑有问题吗？相同的利润怎么判断？
            if (curr == null || curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }


    /**
     *
     * @param merchandiseIndex 索引
     * @return 根据索引获取商品
     */
    public Merchandise getMerchandiseOf(int merchandiseIndex) {
        if (merchandiseIndex < 0 || merchandiseIndex >= merchandises.length) {
            return null;
        }
        return merchandises[merchandiseIndex];
    }

    /**
     * 赚钱
     * @param toBeAdded 收入
     */
    public void addIncomingSum(double toBeAdded) {
        this.incomingSum += toBeAdded;
    }

    /**
     * 花钱
     * @param toBeSpent 1
     * @return 1
     */
    public boolean spendMoney(double toBeSpent) {
        if (toBeSpent > incomingSum) {
            return false;
        }
        incomingSum -= toBeSpent;
        return true;
    }
}
