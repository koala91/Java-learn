package com.market93;
//import com.market93.supermarket.GamePointCard;

import com.market93.supermarket.AbstractExpireDateMerchandise;
import com.market93.supermarket.GamePointCard;

import java.util.Date;


public class UseAbsClass {
    public static void main(String[] args) {
        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);

        GamePointCard gamePointCard = new GamePointCard(
                "点卡001", "点卡001", 100, 1999, 999,
                produceDate, expireDate
        );

        // 父类的引用可以用子类的引用赋值，抽象类也一样
        AbstractExpireDateMerchandise am = gamePointCard;

        am.describe();

    }
}
