module com.example.testgitworkflow_laptop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.testgitworkflow_laptop to javafx.fxml;
    exports com.example.testgitworkflow_laptop;
}