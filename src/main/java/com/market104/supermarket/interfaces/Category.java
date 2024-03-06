package com.market104.supermarket.interfaces;

/**
 * 商品的种类
 */
public enum Category {
    // 食物
    FOOD(10, 300),
    // 厨具
    COOK(200,2000),
    // 小吃
    SNACK(5,100),
    //衣服
    CLOTHES(200,1000),
    // 电器
    ELECTRIC(200, 1000);

    int lowerPrice;
    int higherPrice;

    Category(int lowerPrice, int higherPrice) {
        this.lowerPrice = lowerPrice;
        this.higherPrice = higherPrice;
    }

    public int getLowerPrice() {
        return lowerPrice;
    }

    public void setLowerPrice(int lowerPrice) {
        this.lowerPrice = lowerPrice;
    }

    public int getHigherPrice() {
        return higherPrice;
    }

    public void setHigherPrice(int higherPrice) {
        this.higherPrice = higherPrice;
    }
}
