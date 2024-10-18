module org.example.ejercicioc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ejercicioc to javafx.fxml;
    exports org.example.ejercicioc;
}