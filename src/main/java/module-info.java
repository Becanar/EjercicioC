module org.example.ejercicioc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ejercicioc to javafx.fxml;
    exports org.example.ejercicioc.model;
    opens org.example.ejercicioc.model to javafx.fxml;
    exports org.example.ejercicioc.app;
    opens org.example.ejercicioc.app to javafx.fxml;
}