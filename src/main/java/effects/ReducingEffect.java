package effects;

import javafx.animation.ScaleTransition;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class ReducingEffect {
    public static void addReducingEffect(Button button) {


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
