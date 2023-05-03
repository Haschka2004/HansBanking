module com.example.hansbankingg {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires jdk.httpserver;

    opens com.example.hansbankingg to javafx.fxml;
    exports com.example.hansbankingg;
    exports DatenbankStuff;
    opens DatenbankStuff to javafx.fxml;
}