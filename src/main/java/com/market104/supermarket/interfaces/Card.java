package com.market104.supermarket.interfaces;

public interface Card {

    /**
     *
     * @param totalCost 商品的原价总价
     * @param totalCostAfterDiscount 实行完超市活动后的总价
     * @param customer 购买的顾客
     * @param shoppingCart 购物车
     * @return 优惠额(不是优惠后的价格)
     */

    double processCardDiscount(double totalCost, double totalCostAfterDiscount,
                               Customer customer, ShoppingCart shoppingCart);
}
