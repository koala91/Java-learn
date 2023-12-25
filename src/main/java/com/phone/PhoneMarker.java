package com.phone;


import com.phone.parts.*;

public class PhoneMarker {
    public static void main(String[] args) {
        // 创建一个Phone的实例
        Phone phone = new Phone();

        phone.hasFigurePrintUnlocker = true;
        phone.price = 2999.9;

        phone.screen = new Screen();
        phone.screen.producer = "京东方";
        phone.screen.size = 6.6;

        Mainboard mainboard = new Mainboard();
        mainboard.model = "EA888";
        mainboard.year = 2023;

        mainboard.cpu = new CPU();
        mainboard.cpu.producer = "德州仪器";
        mainboard.cpu.speed = 3.5;

        mainboard.memory = new Memory();
        mainboard.memory.producer = "三星";
        mainboard.memory.capacity = 4;

        mainboard.storage = new Storage();
        mainboard.storage.producer = "Intel";
        mainboard.storage.capacity = 256;

        phone.mainboard = mainboard;

        System.out.println(phone.mainboard.cpu.producer);
    }
}
