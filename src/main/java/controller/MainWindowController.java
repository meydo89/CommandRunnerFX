package controller;

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

        addReducingEffect(buttonOpcionSistemas);
        addReducingEffect(buttonOpcionRedes);
        addReducingEffect(buttonOpcionUpdateTemporales);
        addReducingEffect(buttonCredits);
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


