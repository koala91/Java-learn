package com.market2;

import com.market2.supermarket.PhoneExtendsMerchandise;

public class UsePhoneMerchandise {
    public static void main(String[] args) {
        PhoneExtendsMerchandise phoneExtendsMerchandise = new PhoneExtendsMerchandise(
                "手机001",
                "001",
                100,
                1999,
                999,
                4.5,
                3.5,
                4,
                128,
                "小米",
                "安卓"
        );
        phoneExtendsMerchandise.describe();
        System.out.println();

        System.out.println(phoneExtendsMerchandise.getName());
        System.out.println();

        phoneExtendsMerchandise.buy(100);
        phoneExtendsMerchandise.buy(3);
        System.out.println();

        phoneExtendsMerchandise.accessParentProps();
        phoneExtendsMerchandise.useSuper();

    }
}
