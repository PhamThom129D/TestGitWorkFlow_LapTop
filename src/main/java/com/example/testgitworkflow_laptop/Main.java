package com.example.testgitworkflow_laptop;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        CRUD_Laptop crud = new CRUD_Laptop();
        ShowList showList = new ShowList();
//        String query = "Select * from Laptop";
//        showList.showList(query);
//
//        String query2 = "insert into Laptop(name,RAM,SSD,chipset,price,stock)"+ "values(?,?,?,?,?,?)";
//        crud.addLaptop(query2,"ThinkPad T14s","12GB","256","i7",100.5,true);
//
//        String query3 = "Update Laptop set name = ? where id = ?";
//        crud.updateLaptop(query3,1,"ThinkPad update");
//
//        String query4 = "Delete from Laptop where id = ?";
//        crud.deleteLaptop(query4,3);

        String query5 = "Select * from Laptop where name like ?";
        crud.searchLaptop(query5,"up");

        String query6= "Select * from Laptop where RAM like ?";
        crud.searchLaptop(query6,"8");

        String query7 = "Select * from Laptop where SSD like ?";
        crud.searchLaptop(query7,"256");
    }
}
