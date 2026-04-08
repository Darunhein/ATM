package com.example.atm;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ControllerLogin {

    @FXML
    private TextField txtFUserLogin;
    @FXML
    private TextField txtFPwdLogin;
    @FXML
    private Label lblLoginError;

    @FXML
    private void Login(ActionEvent event) throws IOException{

        if(txtFUserLogin.getText().equals("admin") && txtFPwdLogin.getText().equals("root")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Menu.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }else {
            lblLoginError.setVisible(true);
            txtFUserLogin.clear();
            txtFPwdLogin.clear();
        }
    }

}
