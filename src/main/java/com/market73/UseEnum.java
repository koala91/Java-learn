package com.market73;

import com.market73.supermarket.Category;

public class UseEnum {
    public static void main(String[] args) {
//        获取所有枚举，看看枚举实例有哪些方法
        for (Category category : Category.values()) {
            System.out.println("-----------" + category.getId() + "------------");
            System.out.println(category.ordinal());
            System.out.println(category.name());
            System.out.println(category.toString());
        }

        System.out.println();

//        根据名字获取枚举
        System.out.println(Category.valueOf("FOOD"));

    }
}
