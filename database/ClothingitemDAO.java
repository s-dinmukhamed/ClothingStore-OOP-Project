package database;

import model.clothingitem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClothingitemDAO {
    public void insertItem(clothingitem clothingitem){
        String sql = "INSERT INTO  clothingitem (item_id, size, price, brand, amount) VALUES(?, ?, ?, ?, ?)";

        Connection connection = DatabaseConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            // Set parameters (? → actual values)
            statement.setInt(1, clothingitem.getId());
            statement.setString(2, clothingitem.getSize());
            statement.setDouble(3, clothingitem.getPrice());
            statement.setString(4, clothingitem.getBrand());
            statement.setInt(5, clothingitem.getAmount());
            // Execute INSERT
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println(" Item inserted successfully!");
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println(" Insert failed!");
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(connection);
        }
    }



    public void getAllItems() {
        String sql = "SELECT * FROM clothingitem";
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("\n--- ALL ITEMS FROM DATABASE ---");
            while (resultSet.next()) {
                int id = resultSet.getInt("item_id");
                String size = resultSet.getString("size");
                double price = resultSet.getDouble("price");
                String brand = resultSet.getString("brand");
                int amount = resultSet.getInt("amount");
                System.out.println("ID: " + id);
                System.out.println("Size: " + size);
                System.out.println("Price: " + price);
                System.out.println("Brand: " + brand);
                System.out.println("Amount: " + amount );
                System.out.println("---");
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println(" Select failed!");
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(connection);
        }
    }
}

