package com.market73;

import com.market73.supermarket.Merchandise;
import com.market73.supermarket.Phone;
import com.market73.supermarket.ShellColorChangePhone;

public class MerchandiseTest {
    public void testMerchandiseOverload(Merchandise me) {
        System.out.println("参数为Merchandise的testMerchandiseOverload 被调用了");
    }

    public void testMerchandiseOverload(Phone ph) {
        System.out.println("参数为Phone的testMerchandiseOverload 被调用了");
    }

    public void testMerchandiseOverload(ShellColorChangePhone shellColorChangePhone) {
        System.out.println("参数为ShellColorChangePhone的testMerchandiseOverload 被调用了");
    }

    public void testMerchandiseOverload(String str) {
        System.out.println("参数为String的testMerchandiseOverload 被调用了");
    }

    public void testMerchandiseOverloadNotExactlyMatchType(Merchandise me) {
        System.out.println("参数为MerchandiseV2的testMerchandiseOverloadNotExactlyMatchType 被调用了");
    }

    public void testMerchandiseOverloadNotExactlyMatchType(Phone ph) {
        System.out.println("参数为Phone的testMerchandiseOverloadNotExactlyMatchType 被调用了");
    }

    public void testMerchandiseOverloadNotExactlyMatchType(String str) {
        System.out.println("参数为String的testMerchandiseOverloadNotExactlyMatchType 被调用了");
    }
}
