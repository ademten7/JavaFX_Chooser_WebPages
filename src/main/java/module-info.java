module com.example.javafx_application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_application to javafx.fxml;
    exports com.example.javafx_application;
}