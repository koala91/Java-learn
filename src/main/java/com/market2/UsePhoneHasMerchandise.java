package com.market2;

import com.market2.supermarket.Merchandise;
import com.market2.supermarket.PhoneHasMerchandise;

public class UsePhoneHasMerchandise {
    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise(
                "手机001",
                "001",
                100,
                1999,
                999
        );
        PhoneHasMerchandise phone = new PhoneHasMerchandise(
                4.5,
                3.5,
                4,
                128,
                "小米",
                "安卓",
                merchandise
        );

        phone.describePhone();

        phone.getMerchandise().describe();
        System.out.println(phone.getMerchandise().getName());
    }
}
