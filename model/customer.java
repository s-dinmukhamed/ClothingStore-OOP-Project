package model;

public class customer implements client_compare{
    //private fields
    private int client_id;
    private String name;
    private String address;
    private String email;
    private double loyaltyPoints;

    //Constructor
    public customer(int client_id, String name, String address, String email,  double loyaltyPoints) {
        setClient_id(client_id);
        setName(name);
        setAddress(address);
        setEmail(email);
        setLoyaltyPoints(loyaltyPoints);
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
        if(client_id > 0){
            this.client_id = client_id;
        }else {
            System.out.println("Warning: ID cannot be negative.");
            this.client_id = 0;
        }
    }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Warning: name cannot be empty");
        }
    }
    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        } else {
            System.out.println("Warning: Address cannot be empty!");
        }
    }
    public void setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
        }else{
            System.out.println("Warning: Email must contain\"@\" sign");
        }
    }
    public void setLoyaltyPoints(double loyaltyPoints) {
        if(loyaltyPoints > 0){
            this.loyaltyPoints = loyaltyPoints;
        }else{
            this.loyaltyPoints = 0;
        }
    }

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

    @Override
    public void addPoints(double points) {
        if (points <= 0) return;
        loyaltyPoints += points;
    }

    @Override
    public void removePoints(double points) {
        if (points <= 0) return;
        loyaltyPoints -= points;
        if (loyaltyPoints < 0) loyaltyPoints = 0;
    }


    //To string
    @Override
    public String toString() {
        return "Costumers{Client id = "+client_id+", Client name = "+name+", Address = "+address+", Email = "+email+"}";
    }


}
