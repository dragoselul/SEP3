module com.example.tier1 {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.example.tier1 to javafx.fxml;
    exports com.example.tier1;
}