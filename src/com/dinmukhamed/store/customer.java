package com.dinmukhamed.store;

public class customer {
    //private fields
    private int client_id;
    private String name;
    private String address;
    private String email;

    //Constructor
    public customer(int client_id, String name, String address, String email) {
        this.client_id = client_id;
        this.name = name;
        this.address = address;
        this.email = email;
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

    //Methods


    //To string
    @Override
    public String toString() {
        return "Costumers{Client id = "+client_id+", Client name = "+name+", Address = "+address+", Email = "+email+"}";
    }
}
