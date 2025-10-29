module br.com.joaov.mininavegadorweb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens br.com.joaov.mininavegadorweb to javafx.fxml;
    exports br.com.joaov.mininavegadorweb;
}