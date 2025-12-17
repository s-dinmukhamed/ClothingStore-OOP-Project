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

        customer client1 = new customer(001, "Miras", "Kabanbay Batyr 60a/13", "miras@gmail.com");
        customer client2 = new customer(002, "Sabitzhan", "Akhmet Baitursynuly 45", "sabit@gmail.com");
        customer client3 = new customer(003, "Dimash", "Ostrovskogo 12", "dimash@gmail.com");

        order order1 = new order(1, 2, 26980, "Miras", "Kabanbay Batyr 60a/13");
        order order2 = new order(2, 1, 69990, "Dimash", "Ostrovskogo 12");

        employee employee1 = new employee(1, "Alikhan", 356000, 1);
        employee employee2 = new employee(2, "Alinur", 356000, 2);


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

        System.out.println(" --- Employees --- ");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println();


        //Test getters
        System.out.println(" --- Testing ClothingItem GETTERS --- ");
        System.out.println("Clothing id: " + item1.getId());
        System.out.println("Size: " + item1.getSize());
        System.out.println("Price: " + item1.getPrice());
        System.out.println("Brand: " + item1.getBrand());
        System.out.println("Amount: " + item1.getAmount());
        System.out.println();

        System.out.println("Clothing id: " + item2.getId());
        System.out.println("Size: " + item2.getSize());
        System.out.println("Price: " + item2.getPrice());
        System.out.println("Brand: " + item2.getBrand());
        System.out.println("Amount: " + item2.getAmount());
        System.out.println();

        System.out.println("Clothing id: " + item3.getId());
        System.out.println("Size: " + item3.getSize());
        System.out.println("Price: " + item3.getPrice());
        System.out.println("Brand: " + item3.getBrand());
        System.out.println("Amount: " + item3.getAmount());
        System.out.println();

        System.out.println("Clothing id: " + item4.getId());
        System.out.println("Size: " + item4.getSize());
        System.out.println("Price: " + item4.getPrice());
        System.out.println("Brand: " + item4.getBrand());
        System.out.println("Amount: " + item4.getAmount());
        System.out.println();

        System.out.println(" --- Testing Order GETTERS --- ");
        System.out.println("Order ID: " + order1.getOrder_id());
        System.out.println("Amount of items: " + order1.getAmountOfItems());
        System.out.println("Final price: " +  order1.getFinal_price());
        System.out.println("Customers name: " + order1.getCustomer_name());
        System.out.println("Customers adress: " + order1.getCustomer_adress());
        System.out.println();

        System.out.println("Order ID: " + order2.getOrder_id());
        System.out.println("Amount of items: " + order2.getAmountOfItems());
        System.out.println("Final price: " +  order2.getFinal_price());
        System.out.println("Customers name: " + order2.getCustomer_name());
        System.out.println("Customers adress: " + order2.getCustomer_adress());

        System.out.println(" --- Testing Customer GETTERS --- ");
        System.out.println("Client ID: " + client1.getClient_id());
        System.out.println("Client name: " + client1.getName());
        System.out.println("Client address: " + client1.getAddress());
        System.out.println("Client email: " + client1.getEmail());
        System.out.println();

        System.out.println("Client ID: " + client2.getClient_id());
        System.out.println("Client name: " + client2.getName());
        System.out.println("Client address: " + client2.getAddress());
        System.out.println("Client email: " + client2.getEmail());
        System.out.println();

        System.out.println("Client ID: " + client3.getClient_id());
        System.out.println("Client name: " + client3.getName());
        System.out.println("Client address: " + client3.getAddress());
        System.out.println("Client email: " + client3.getEmail());
        System.out.println();

        System.out.println(" --- Testing Employee GETTERS --- ");
        System.out.println("Employee ID: " + employee1.getEmployee_id());
        System.out.println("Employee name: " + employee1.getEmployee_name());
        System.out.println("Paycheck: " + employee1.getPaycheck());
        System.out.println("Taken order id: " + employee1.getTaken_order());
    }
}