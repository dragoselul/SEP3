module com.example.tier2 {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.example.tier2 to javafx.fxml;
    exports com.example.tier2;
}