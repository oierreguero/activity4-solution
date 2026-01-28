package com.example.javafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button myButton;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleButtonClick() {
        messageLabel.setText("You clicked on the button");
        messageLabel.setVisible(true);
    }
}
