package com.dinmukhamed.store;

public class Main {
    public static void main(String[] args) {
        System.out.println(" === Welcome to Clothing Store === ");
        System.out.println();

        //Objects
        clothingitem item1 = new clothingitem(1001, "M", 16990, "Nike", 9, "T-Shirt");
        clothingitem item2 = new clothingitem(1002, "L", 18990, "Adidas", 2, "Pants");
        clothingitem item3 = new clothingitem(1003, "L", 9900, "Puma", 15, "T-Shirt");
        clothingitem item4 = new clothingitem(1004, "S", 69990, "Nike", 6, "Jacket");

        customer client1 = new customer(001, "Miras", "Kabanbay Batyr 60a/13", "miras@gmail.com", 600);
        customer client2 = new customer(002, "Sabitzhan", "Akhmet Baitursynuly 45", "sabit@gmail.com", 405);
        customer client3 = new customer(003, "Dimash", "Ostrovskogo 12", "dimash@gmail.com", 900);

        order order1 = new order(1, 2, 26980, "Miras", "Kabanbay Batyr 60a/13");
        order order2 = new order(2, 1, 69990, "Dimash", "Ostrovskogo 12");


        //Display state
        System.out.println(" --- Menu --- ");
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println();

        System.out.println(" --- Orders --- ");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println();

        System.out.println(" --- Customers --- ");
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println();


        //Test getters
        System.out.println(" --- Testing ClothingItem GETTERS --- ");
        System.out.println("Clothing id: " + item4.getId());
        System.out.println("Size: " + item4.getSize());
        System.out.println("Price: " + item4.getPrice());
        System.out.println("Brand: " + item4.getBrand());
        System.out.println("Amount: " + item4.getAmount());
        System.out.println();

        System.out.println(" --- Testing Order GETTERS --- ");
        System.out.println("Order ID: " + order2.getOrder_id());
        System.out.println("Amount of items: " + order2.getAmountOfItems());
        System.out.println("Final price: " +  order2.getFinal_price());
        System.out.println("Customers name: " + order2.getCustomer_name());
        System.out.println("Customers adress: " + order2.getCustomer_adress());
        System.out.println();

        System.out.println(" --- Testing Customer GETTERS --- ");
        System.out.println("Client ID: " + client3.getClient_id());
        System.out.println("Client name: " + client3.getName());
        System.out.println("Client address: " + client3.getAddress());
        System.out.println("Client email: " + client3.getEmail());
        System.out.println("Client loyalty points: " + client3.getLoyaltyPoints());
        System.out.println();

        //Testing setters
        System.out.println("--- TESTING SETTERS ---");
        System.out.println("Updating item 4");
        item4.setSize("L");
        item4.setPrice(56990);
        item4.setBrand("Zara");
        item4.setAmount(2);
        item4.setTypeOfCloth("Coat");
        System.out.println("Updated: "+item4);
        System.out.println();

        //testing methods
        System.out.println(" --- Testing ClothingItem Methods ---");
        System.out.println("Few models left: " + item4.amountCheck());
        System.out.println("Applying 10% discount to " + item4.getBrand() + " " +  item4.getTypeOfCloth());
        item4.applDiscount(10);
        System.out.println("New price: " + item4.getPrice());
        System.out.println();

        System.out.println(" --- Testing Order Methods ---");
        order2.cashback();
        System.out.println(order2.getCustomer_name() + " earned " + order2.loyaltyBonus() + " loyalty points");
        System.out.println();

        System.out.println(" --- Testing Customer Methods ---");
        System.out.println(client3.getName() + " is VIP: " + client3.isVIP());
        client3.pointsDeduction(6);
        System.out.println();

        //Final Summary
        System.out.println("--- FINAL STATE ---");
        System.out.println("Menu items: ");
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println();

        System.out.println("Orders:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println();
        System.out.println("Customers:");
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println("\n=== Program Complete ===");
    }
}