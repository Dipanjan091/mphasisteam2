package com.mphasis.main.cui;

import java.util.UUID;

public class UserOrder {
    public double price;
    public int quantity;
    public String clientID;
    public UUID orderID;
    public OrderType type;
    public boolean isRealOrder;


    public UserOrder( String client, OrderType type, int qty,  double price  )
    {
        this.price = price;
        this.quantity = qty;
        this.clientID = client;
        this.type = type;
        this.orderID = UUID.randomUUID();
        isRealOrder = true;

    }
    public UserOrder(){
        this.isRealOrder = false;
    }

}