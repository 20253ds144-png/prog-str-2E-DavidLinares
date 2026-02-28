module com.example.demoprueba {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.demoprueba to javafx.fxml;
    exports com.example.demoprueba;
}