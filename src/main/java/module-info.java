module com.example.choosefourcards_syed {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.choosefourcards_syed to javafx.fxml;
    exports com.example.choosefourcards_syed;
}