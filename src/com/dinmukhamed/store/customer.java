package com.dinmukhamed.store;

public class customer {
    //private fields
    private int client_id;
    private String name;
    private String address;
    private String email;
    private double loyaltyPoints;

    //Constructor
    public customer(int client_id, String name, String address, String email,  double loyaltyPoints) {
        this.client_id = client_id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.loyaltyPoints = loyaltyPoints;
    }

    //Getters
    public int getClient_id() {
        return client_id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public double getLoyaltyPoints() {return loyaltyPoints;}

    //Setters
    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setLoyaltyPoints(double loyaltyPoints) {this.loyaltyPoints = loyaltyPoints;}

    //Methods
    public boolean isVIP(){
        if (loyaltyPoints > 800){
            return true;
        }else{
            return false;
        }
    }

    public void pointsDeduction(int monthsWithoutShopping){
        if (monthsWithoutShopping >= 6){
            System.out.println("All loyalty points were removed");
        }else {
            System.out.println("Loyalty points are saved");
        }
    }



    //To string
    @Override
    public String toString() {
        return "Costumers{Client id = "+client_id+", Client name = "+name+", Address = "+address+", Email = "+email+"}";
    }
}
