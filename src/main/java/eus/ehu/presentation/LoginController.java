package eus.ehu.presentation;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class LoginController {
    @FXML
    private Button myButton;

    @FXML
    private Label messageLabel;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    // timer to auto-hide error message
    private PauseTransition hideMessageTimer;

    @FXML
    public void initialize() {
        messageLabel.setAlignment(Pos.CENTER);
        myButton.setDefaultButton(true);
        hideMessageTimer = new PauseTransition(Duration.seconds(2));
        hideMessageTimer.setOnFinished(e -> messageLabel.setVisible(false));
    }

    @FXML
    private void handleLogin() {
        String login = loginField.getText();
        String password = passwordField.getText();

        if ("admin".equals(login) && "123456".equals(password)) {
            messageLabel.setText("Credentials are correct");
            messageLabel.setVisible(true);
            messageLabel.getStyleClass().setAll("btn","btn-success");
        } else {
            messageLabel.setText("Try again");
            messageLabel.setVisible(true);
            messageLabel.getStyleClass().setAll("btn","btn-danger");
            // hide after 2 seconds
            hideMessageTimer.playFromStart();
        }
    }
}
