package com.dinmukhamed.store;

public class order {
    //Private fields
    private int order_id;
    private int amountOfItems;
    private double final_price;
    private String customer_name;
    private String customer_adress;

    //Constructor
    public order(int order_id, int amountOfItems, double final_price, String customer_name, String customer_adress) {
        this.order_id = order_id;
        this.amountOfItems = amountOfItems;
        this.final_price = final_price;
        this.customer_name = customer_name;
        this.customer_adress = customer_adress;
    }

    //Getters
    public int getOrder_id() {
        return order_id;
    }
    public int getAmountOfItems() {
        return amountOfItems;
    }
    public double getFinal_price() {
        return final_price;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public String getCustomer_adress() {
        return customer_adress;
    }

    //Setters
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public void setAmountOfItems(int amountOfItems) {
        this.amountOfItems = amountOfItems;
    }
    public void setFinal_price(double final_price) {
        this.final_price = final_price;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public void setCustomer_adress(String customer_adress) {this.customer_adress = customer_adress;}

    //methods


    //To string
    @Override
    public String toString() {
        return "Order{Order Id = " + order_id + ", Amount of Items = " + amountOfItems + ", Final Price = " + final_price +
                ", Customers name = " +  customer_name + ", Customers Adress = " + customer_adress + "}";
    }
}
