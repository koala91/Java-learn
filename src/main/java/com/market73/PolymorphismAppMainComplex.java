package com.market73;

import com.market73.supermarket.LittleSuperMarket;

public class PolymorphismAppMainComplex {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket(
                "大卖场",
                "世纪大道1号",
                500,
                600,
                100);

        // Merchandise里的describe方法，调用了calculateProfit方法
        // Phone里的describe方法，覆盖了直接父类MerchandiseV2里的describe方法，并且使用super调用了父类的describe方法
        // ShellColorChangePhone里的describe方法，覆盖了直接父类Phone里的describe方法，并且使用super调用了父类的describe方法
        // 更复杂的是，ShellColorChangePhone还覆盖了间接父类MerchandiseV2里的calculateProfit方法
        superMarket.getMerchandiseOf(0).describe();
        System.out.println();
        superMarket.getMerchandiseOf(10).describe();
        System.out.println();
        superMarket.getMerchandiseOf(100).describe();
        // 总结：无论一个方法是使用哪个引用被调用的，"它都是在实际的对象上执行的"。执行的任何一个方法，都是这个对象所属的类的方法。
        // 如果没有，就去父类找，再没有，就去父类的父类找，依次寻找，知道找到。
        // 换个角度理解。我们一直说子类里又一个（特殊的）父类的对象。这时候，这个特殊的父类的对象里的this自引用，是子类的引用。
        // 那么自然的，即使是在继承自父类的代码里，去调用一个方法，也是先从子类开始，一层层继承关系的找。
        // 这也是Java选择单继承的重要原因之一。在多继承的情况下，如果使用不当，多态可能会非常复杂，以至于使用的代价超过其带来的好处。
    }
}
