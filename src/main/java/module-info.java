module com.example.hansbankingg {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.hansbankingg to javafx.fxml;
    exports com.example.hansbankingg;
}