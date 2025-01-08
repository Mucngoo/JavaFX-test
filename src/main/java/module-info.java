module org.example.squidfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.squidfx to javafx.fxml;
    exports org.example.squidfx;
}