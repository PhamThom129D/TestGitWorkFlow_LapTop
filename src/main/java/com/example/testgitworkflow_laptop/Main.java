package com.example.testgitworkflow_laptop;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        CRUD_Laptop crud = new CRUD_Laptop();
        ShowList showList = new ShowList();
        String query = "Select * from Laptop";
        showList.showList(query);

        String query2 = "insert into Laptop(name,RAM,SSD,chipset,price,stock)"+ "values(?,?,?,?,?,?)";
        crud.addLaptop(query2,"ThinkPad T14s","12GB","256","i7",100.5,true);

        String query3 = "Update Laptop set name = ? where id = ?";
        crud.updateLaptop(query3,1,"ThinkPad update");

        String query4 = "Delete from Laptop where id = ?";
        crud.deleteLaptop(query4,3);
    }
}
