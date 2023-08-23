package controller;

import effects.ReducingEffect;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class MainWindowController {

    @FXML
    private Button buttonOpcionSistemas;

    @FXML
    private Button buttonOpcionRedes;

    @FXML
    private Button buttonOpcionUpdateTemporales;
    @FXML
    private Button buttonCredits;

    @FXML
    private void initialize() {
        ReducingEffect.addReducingEffect(buttonOpcionSistemas);
        ReducingEffect.addReducingEffect(buttonOpcionRedes);
        ReducingEffect.addReducingEffect(buttonOpcionUpdateTemporales);
        ReducingEffect.addReducingEffect(buttonOpcionUpdateTemporales);
        ReducingEffect.addReducingEffect(buttonCredits);
    }

    @FXML
    public void pulsarBotonSistemas(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/frames/windowSystem.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 800, 500);
        stage.setTitle("Comprobar y Reparar Ficheros e Imagen de Windows");
        Image icon = new Image(getClass().getResourceAsStream("/imgSystem/iconApp.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void pulsarBotonRedes(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/frames/windowNetworks.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 800, 500);
        stage.setTitle("Creditos");
        Image icon = new Image(getClass().getResourceAsStream("/imgSystem/iconApp.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    @FXML
    public void pulsarBotonUpdateTemp(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/frames/windowUpdateTemp.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 800, 500);
        stage.setTitle("Reparar Actualizaciones y Eliminar Temporales");
        Image icon = new Image(getClass().getResourceAsStream("/imgSystem/iconApp.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    @FXML
    public void pulsarBotonCreditos(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/frames/credits.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 800, 500);
        stage.setTitle("Reparar Actualizaciones y Eliminar Temporales");
        Image icon = new Image(getClass().getResourceAsStream("/imgSystem/iconApp.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    }


