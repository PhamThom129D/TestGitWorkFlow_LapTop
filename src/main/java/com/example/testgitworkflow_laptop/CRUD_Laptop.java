package com.example.testgitworkflow_laptop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD_Laptop {
    Connection connection = DatabaseConnection.getConnection();
    Statement statement = connection.createStatement();

    public CRUD_Laptop() throws SQLException {
    }

    //    Thêm laptop mới
    public void addLaptop(String query, String name, String RAM, String SSD, String chipset, Double price, Boolean stock) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, name);
        statement.setString(2, RAM);
        statement.setString(3, SSD);
        statement.setString(4, chipset);
        statement.setDouble(5, price);
        statement.setBoolean(6, stock);
        statement.executeUpdate();
        statement.close();
    }

    // Cập nhật thông tin laptop
    public void updateLaptop(String query, int ID, String name) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(2, ID);
        statement.setString(1, name);
        statement.executeUpdate();
        statement.close();
    }

    // Xóa laptop
    public void deleteLaptop(String query,int ID) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, ID);
        statement.executeUpdate();
        statement.close();
    }
}
