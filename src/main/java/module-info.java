module com.example.testgitworkflow_laptop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testgitworkflow_laptop to javafx.fxml;
    exports com.example.testgitworkflow_laptop;
}