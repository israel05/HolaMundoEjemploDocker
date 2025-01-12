package es.israeldelamo.holamundofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


/**
 * Controladora autogenerado por intellij
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}