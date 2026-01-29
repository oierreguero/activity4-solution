package eus.ehu.presentation;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Button myButton;

    @FXML
    private Label messageLabel;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    public void initialize() {
        messageLabel.setAlignment(Pos.CENTER);
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
        }
    }
}
