package com.market73;

import com.market73.supermarket.LittleSuperMarket;

import java.util.Scanner;

public class StringEqualsAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket(
                "大卖场",
                "世纪大道1号",
                500,
                600,
                100);

        String s1 = "aaabbb";

        String s2 = "aaa" + "bbb";
        // == 看引用是否一样
        // equals看字符串是否一样
        // 比较对象用equals

//        说好每次创建一个新的String对象呢
        System.out.println("s1和s2用==判断结果："+(s1 == s2));

        System.out.println("s1和s2用 equals 判断结果："+(s1.equals(s2)));
        // 打乱java对String的优化，再试一下
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入s1");
        s1 = scanner.nextLine();

        System.out.println("请输入s2");
        s2 = scanner.nextLine();

        System.out.println("s1和s2用==判断结果："+(s1 == s2));

        System.out.println("s1和s2用 equals 判断结果："+(s1.equals(s2)));
    }
}
