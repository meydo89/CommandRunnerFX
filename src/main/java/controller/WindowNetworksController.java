package controller;

import builds.PathNetWorksCommands;
import effects.ReducingEffect;
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
       ReducingEffect.addReducingEffect(botonRealizarPing);
       ReducingEffect.addReducingEffect(botonRealizarTracert);
       ReducingEffect.addReducingEffect(botonRealizarNslookup);
       ReducingEffect.addReducingEffect(botonRealizarNetstat);
       ReducingEffect.addReducingEffect(botonReestablecerAdaptadorRed);
       ReducingEffect.addReducingEffect(botonRealizarIpConfig);
    }
}
