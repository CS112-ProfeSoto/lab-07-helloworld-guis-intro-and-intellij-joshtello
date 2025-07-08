package com.example.lab7;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button changedButton;
    @FXML
    private TextField inputName;
    int i = 0;
    @FXML
    protected void onHelloButtonClick() {
        i++;
        System.out.println("Hello CS112");
        String input = inputName.getText();
        welcomeText.setText("Hi #" + i +", " + input + "!");
    }


}