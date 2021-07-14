package com.mphasis.types;

public enum Apple {
    GOLDEN_DEL(34),RED_DEL(56);

    int price;
    Apple(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
