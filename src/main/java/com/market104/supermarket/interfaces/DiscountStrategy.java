package com.market104.supermarket.interfaces;

/**
 * 超市的折扣策略
 */
public interface DiscountStrategy {
    /**
     *
     * @param shoppingCart 购物车商品
     * @return 因为此折扣策略所折扣掉的钱(并非折扣的总价)
     */
    double discount(ShoppingCart shoppingCart);
}
