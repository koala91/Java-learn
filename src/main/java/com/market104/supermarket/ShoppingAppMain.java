package com.market104.supermarket;


import com.market104.supermarket.impl.SimpleShopman;
import com.market104.supermarket.interfaces.Customer;
import com.market104.supermarket.interfaces.Shopman;
import com.market104.supermarket.interfaces.SuperMarket;

import static com.market104.supermarket.util.ShoppingUtil.*;

public class ShoppingAppMain {
    public static void main(String[] args) {


        SuperMarket superMarket = createSuperMarket();

        Shopman shopman = new SimpleShopman(superMarket);

        boolean open = true;

        while (open) {
            new ShoppingTask(shopman).executeTask();
            output("是否继续营业？(Yes)");
            open = ! input().next().trim().equalsIgnoreCase("no");
        }

        superMarket.dailyReport();

    }
}

class ShoppingTask {

    private Shopman shopman;

    public ShoppingTask(Shopman shopman) {
        this.shopman = shopman;
    }

    public void executeTask() {
        Customer customer = createCustomer(true);

        shopman.serveCustomer(customer);

    }

}
