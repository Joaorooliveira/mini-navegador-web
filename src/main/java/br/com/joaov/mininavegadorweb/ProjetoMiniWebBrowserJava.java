package br.com.joaov.mininavegadorweb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.web.WebView;
import java.io.IOException;

public class ProjetoMiniWebBrowserJava extends Application {
    @Override
    public void start(Stage palco) throws IOException {
        TextField campoUrl = new TextField();
        WebView navegador = new WebView();
        WebEngine motor = navegador.getEngine();

        //Carregar uma pagina da web quando o usuario pressionar Enter
        campoUrl.setOnAction(evento -> {
            motor.load(campoUrl.getText());
        });

        VBox vbox = new VBox();
        vbox.getChildren().addAll(campoUrl, navegador);
        Scene cena =  new Scene(vbox);

        palco.setTitle("Meu Browser Java");
        palco.setScene(cena);
        palco.show();

    }
}
