module com.example.hw3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
    opens com.example.hw3 to javafx.fxml, com.google.gson;
    exports com.example.hw3;
}