package com.market73;

import com.market73.supermarket.LittleSuperMarket;
import com.market73.supermarket.Merchandise;
import com.market73.supermarket.ShellColorChangePhone;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassOfClassAppMain {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        Merchandise m100 = superMarket.getMerchandiseOf(100);

        // Object类里面的getClass方法，可以得到
        Class clazz = m100.getClass();
//        上面的写法，也可以改成下面这样
//      Class clazz = ShellColorChangePhone.class;
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        // 通过一个类的Clas实例，可以获取一个类所有的信息，包括成员变量，方法等
        Field countField = clazz.getField("count");
        System.out.println(countField.getName()); // 返回成员变量的名字
        System.out.println(countField.getType()); // 返回成员变量的类型：int

        // 变长参数和它的等价形式
        Method buyMethod = clazz.getMethod("buy", int.class);
        Method equalsMethod = clazz.getMethod("equals", Object.class);
        System.out.println(buyMethod);
        System.out.println(equalsMethod);
    }
}
