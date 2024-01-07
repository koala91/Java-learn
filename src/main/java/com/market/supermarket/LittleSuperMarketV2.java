package com.market.supermarket;

public class LittleSuperMarketV2 {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2 [] merchandises;
    public int[] merchandiseSold;

    public void init(String superMarketName, String address, int parkingCount, int merchandiseCount, int count) {
        this.superMarketName = superMarketName;
        this.address = address;
        this.parkingCount = parkingCount;

        merchandises = new MerchandiseV2[merchandiseCount];
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = new MerchandiseV2();
            m.count = count;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            merchandises[i] = m;
        }
        merchandiseSold = new int[merchandises.length];
    }

//    简单的访问成员变量
    public String getSuperMarketName() {
        return superMarketName;
    }
    public String getAddress() {
        return  address;
    }
    public int getParkingCount() {
        return parkingCount;
    }
    public double getIncomingSum() {
        return  incomingSum;
    }
    public void setSuperMarketName(String superMarketName) {
        this.superMarketName = superMarketName;
    }
    public void  setAddress(String address){
        this.address = address;
    }
    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }
    public void setIncomingSum(double incomingSum) {
        this.incomingSum = incomingSum;
    }
    public void setMerchandises(MerchandiseV2[] merchandises) {
        this.merchandises = merchandises;
    }
    public void setMerchandiseSold(int[] merchandiseSold) {
        this.merchandiseSold = merchandiseSold;
    }
    // 一些特殊的逻辑

    //    返回值可以是类名，实际返回值就是这个类的引用
    public MerchandiseV2 getBiggestProfitMerchandise() {
        MerchandiseV2 curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = merchandises[i];
            if (curr == null) {
                curr = m;
                continue;
            }
            if (curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return  curr;
    }

    /**
     * 根据索引获取商品
     * @param merchandiseIndex
     * @return
     */
    public MerchandiseV2 getMerchandisesOf(int merchandiseIndex) {
        if (merchandiseIndex < 0 || merchandiseIndex >= merchandises.length) {
            return  null;
        }
        return merchandises[merchandiseIndex];
    }

    /**
     * 赚钱
     * @param toBeAdded
     */
    public void addIncomingSum(double toBeAdded) {
        this.incomingSum = this.incomingSum + toBeAdded;
    }
}
