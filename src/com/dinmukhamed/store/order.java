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
        setOrder_id(order_id);
        setAmountOfItems(amountOfItems);
        setFinal_price(final_price);
        setCustomer_name(customer_name);
        setCustomer_adress(customer_adress);
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
        if(order_id > 0){
            this.order_id = order_id;
        }else{
            this.order_id = 0;
        }
    }
    public void setAmountOfItems(int amountOfItems) {
        if( amountOfItems >= 0) {
            this.amountOfItems = amountOfItems;
        }else {
            System.out.println("Warning: amount of items cannot be negative");
            this.amountOfItems = 0;
        }
    }
    public void setFinal_price(double final_price) {
        if(final_price > 0) {
            this.final_price = final_price;
        }else{
            System.out.println("Warning: Price cannot be negative");
            this.final_price = 0;
        }
    }
    public void setCustomer_name(String customer_name) {
        if (customer_name != null && !customer_name.trim().isEmpty()) {
            this.customer_name = customer_name;
        } else {
            System.out.println("Warning: name cannot be empty");
        }
    }
    public void setCustomer_adress(String customer_adress) {
        if (customer_adress != null && !customer_adress.trim().isEmpty()) {
            this.customer_adress = customer_adress;
        } else {
            System.out.println("Warning: address cannot be empty");
        }
    }

    //methods
    public void cashback(){
        int cashBackPercent = 10;
        double cashback = final_price * cashBackPercent / 100;
        System.out.println("Cashback equals to " + cashback);
    }

    public double loyaltyBonus(){
        double points = final_price * 1/1000;
        return points;
    }

    //To string
    @Override
    public String toString() {
        return "Order{Order Id = " + order_id + ", Amount of Items = " + amountOfItems + ", Final Price = " + final_price +
                ", Customers name = " +  customer_name + ", Customers Adress = " + customer_adress + "}";
    }
}
