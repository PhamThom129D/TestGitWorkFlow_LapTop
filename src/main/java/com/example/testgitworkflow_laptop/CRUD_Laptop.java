package com.example.testgitworkflow_laptop;

import java.sql.*;

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
    //Tìm kiếm sản phẩm
    public void searchLaptop(String query, String searchName) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, "%"+searchName+"%");
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            String ram = rs.getString("RAM");
            String ssd = rs.getString("SSD");
            String chipset = rs.getString("chipset");
            Double price = rs.getDouble("price");
            Boolean stock = rs.getBoolean("stock");
            System.out.println("Danh sách laptop tìm kiếm : "+ name + " , " + ram + " , " + ssd + " , " + chipset + " , " + price + " , " + stock);
        }
    }
}
