package com.dinmukhamed.store;

public class clothingitem {
    //Private fields
    private int item_id;
    private String size;
    private double price;
    private String brand;
    private int amount;
    private String typeOfCloth;

    //Consttructor with parameters
    public clothingitem(int item_id, String size, double price, String brand,  int amount,  String typeOfCloth) {
        this.item_id = item_id;
        this.size = size;
        this.price = price;
        this.brand = brand;
        this.amount = amount;
        this.typeOfCloth = typeOfCloth;
    }

    //Getters
    public int getId() {return item_id;}
    public String getSize() {return size;}
    public double getPrice() {return price;}
    public String getBrand() {return brand;}
    public int getAmount() {return amount;}
    public String getTypeOfCloth() {return typeOfCloth;}

    //Setters
    public void setId(int item_id) {this.item_id = item_id;}
    public void setSize(String size) {this.size = size;}
    public void setPrice(double price) {this.price = price;}
    public void setBrand(String brand) {this.brand = brand;}
    public void setAmount(int amount) {this.amount = amount;}
    public void setTypeOfCloth(String typeOfCloth) {this.typeOfCloth = typeOfCloth;}

    //Methods
    public void applDiscount(double Percent){
        double discount = price * (Percent/100);
        price =  price - discount;
    }
    public boolean amountCheck(){
        if(amount >= 10){
            return false;
        }else{
            return true;
        }
    }


    //To string
    @Override
    public String toString() {
        return "ClothingItem{Item id=" + item_id + ", Size = " + size + ", Price=" + price + ", Brand='" + brand + "', Amount=" + amount + "}";
    }
}
