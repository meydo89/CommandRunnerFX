package controller;

import builds.PathNetWorksCommands;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class WindowNetworksController {
    @FXML
    private Button botonRealizarPing;
    @FXML
    private Button botonRealizarTracert;
    @FXML
    private Button botonRealizarNslookup;
    @FXML
    private Button botonRealizarNetstat;
    @FXML
    private Button botonReestablecerAdaptadorRed;
    @FXML
    private Button botonRealizarIpConfig;

    public void pulsarBotonRealizarPing(MouseEvent mouseEvent) {
        PathNetWorksCommands comandoPing = new PathNetWorksCommands();
        comandoPing.ejecutarComandoPing();
    }

    @FXML
    void pulsarBotonRealizarTracert(MouseEvent event) {
        PathNetWorksCommands realizarTracert = new PathNetWorksCommands();
        realizarTracert.ejecutarComandoTracert();
    }

    @FXML
    void pulsarBotonVerMiConfiRed(MouseEvent event) {
        PathNetWorksCommands verMiConfifRed = new PathNetWorksCommands();
        verMiConfifRed.ejecutarComandoVerMiConfiRed();

    }

    @FXML
    void pulsarBotonRealizarNslookup(MouseEvent event) {
        PathNetWorksCommands realizarNslookup = new PathNetWorksCommands();
        realizarNslookup.ejecutarComandoNslookup();
    }



    public void pulsarBotonRealizarNetstat(MouseEvent mouseEvent) {
        PathNetWorksCommands realizarNetstat = new PathNetWorksCommands();
        realizarNetstat.ejecutarComandoNetstat();

    }

    public void pulsarBotonReestablecerAdaptadorRed(MouseEvent mouseEvent) {
        PathNetWorksCommands reestablecerAdaptadorRed = new PathNetWorksCommands();
        reestablecerAdaptadorRed.ejecutarComandoReestablecerAdaptadorRed();
    }
    @FXML
    private void initialize() {
        addReducingEffect(botonRealizarPing);
        addReducingEffect(botonRealizarTracert);
        addReducingEffect(botonRealizarNslookup);
        addReducingEffect(botonRealizarNetstat);
        addReducingEffect(botonReestablecerAdaptadorRed);
        addReducingEffect(botonRealizarIpConfig);
    }

    private void addReducingEffect(Button button) {

        ScaleTransition scaleDownTransition = new ScaleTransition(Duration.millis(200), button);
        scaleDownTransition.setToX(0.8);
        scaleDownTransition.setToY(0.8);

        ScaleTransition scaleUpTransition = new ScaleTransition(Duration.millis(200), button);
        scaleUpTransition.setToX(1.0);
        scaleUpTransition.setToY(1.0);

        button.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            scaleDownTransition.playFromStart();
            event.consume();
        });

        button.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            scaleDownTransition.stop();
            scaleUpTransition.playFromStart();
            event.consume();
        });
    }
}
