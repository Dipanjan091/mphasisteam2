package com.mphasis.main.cui;

import java.util.UUID;

public class Order {
    public double price;
    public int quantity;
    public String clientID;
    public UUID orderID;
    public OrderType type;
    public boolean isRealOrder;


    public Order( String client, OrderType type, int qty,  double price  )
    {
        this.price = price;
        this.quantity = qty;
        this.clientID = client;
        this.type = type;
        this.orderID = UUID.randomUUID();
        isRealOrder = true;

    }
    public Order(){
        this.isRealOrder = false;
    }

}

