package com.market93.supermarket;

import java.util.Date;

// 一个类只能继承一个父类，但是可以实现多个接口
// 如果实现的接口里定义了一样的方法，那么也没问题。但是要求方法名，参数，返回值类型都必须一摸一样。
// 一个类只能继承一个父类，即使是抽象类，也只能是一个
public class GamePointCard extends AbstractExpireDateMerchandise implements VirtualMerchandise{


    public GamePointCard(String name, String id, int count, double soldPrice, double purchasePrice, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice, produceDate, expirationDate);
    }

    @Override
    public double actualValueNow(double leftDatePercentage) {
        return super.getSoldPrice();
    }
}
