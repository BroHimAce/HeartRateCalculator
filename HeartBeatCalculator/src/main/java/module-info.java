module com.example.heartbeatcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.heartbeatcalculator to javafx.fxml;
    exports com.example.heartbeatcalculator;
}