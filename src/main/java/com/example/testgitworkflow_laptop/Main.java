package com.example.testgitworkflow_laptop;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ShowList showList = new ShowList();
        String query = "Select * from Laptop";
        showList.showList(query);
    }
}
