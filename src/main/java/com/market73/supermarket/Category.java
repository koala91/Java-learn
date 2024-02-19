package com.market73.supermarket;

//使用enum而非class声明
public enum Category {
//    必须在开始的时候以这种形式，创建所有的枚举对象
    FOOD(1),
    COOK(3),
    SNACK(5),
    CLOTHES(7),
    ELECTRIC(9);

    // 可以有属性
    private int id;

    // 构造方法必须是private的，不写也是private的
    Category(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                '}';
    }
}

