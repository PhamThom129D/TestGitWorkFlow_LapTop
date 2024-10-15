package com.example.testgitworkflow_laptop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowList {
    Connection conn = DatabaseConnection.getConnection();
    Statement stmt = conn.createStatement();

    public ShowList() throws SQLException {
    }
    public void showList(String query) throws SQLException {
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString("name");
            String ram = rs.getString("RAM");
            String ssd = rs.getString("SSD");
            String chipset = rs.getString("chipset");
            Double price = rs.getDouble("price");
            Boolean stock = rs.getBoolean("stock");
            System.out.println("Danh sách laptop : "+ name + " , " + ram + " , " + ssd + " , " + chipset + " , " + price + " , " + stock);
        }
        rs.close();
    }
}
