package com.example.hansbankingg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.*;
public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button cancelButton;
    @FXML
    private Label error;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField pwField;


    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to HansBanking!");
    }

    @FXML
    public void setCancelButton(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void speichernButton(ActionEvent e) {
        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        boolean rules = false;

        if (usernameTextField.getText().isBlank() == true || pwField.getText().isBlank() == true) {
            error.setText("Benutzer oder Passwort wurde nicht angegeben");
        } else {

            if (pwField.getText().length() >= 14) {
                for (char c : pwField.getText().toCharArray()) {
                    if (Character.isDigit(c)) {
                        hasDigit = true;
                    } else if (Character.isLowerCase(c)) {
                        hasLowercase = true;
                    } else if (Character.isUpperCase(c)) {
                        hasUppercase = true;
                    } else if (!Character.isLetterOrDigit(c)) {
                        hasSpecialChar = true;
                    }
                    if (hasDigit == true && hasLowercase == true && hasUppercase == true && hasSpecialChar == true) {
                        error.setText("Gut Gemacht");
                    }
                }
                if (hasDigit == false) {
                    error.setText("Keine Zahlen");
                }
                if(hasLowercase == false){
                    error.setText("Keine Kleinbuchstaben");
                }
                if(hasSpecialChar == false){
                    error.setText("keine Sonderzeichen");
                }
                if(hasUppercase==false){
                    error.setText("keine Großbuchstaben");
                }
            } else {
                error.setText("Passwort Kriterien wurden nicht berücksichtigt!");
            }
        }
    }
    }




