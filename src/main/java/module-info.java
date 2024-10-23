module org.example.kiritod {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.kiritod to javafx.fxml;
    exports org.example.kiritod;
}