package com.example.atm;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerDeposit {
    @FXML
    private TextField txtDeposito;
    @FXML
    private void onButtonDepositar() {
        String texto = txtDeposito.getText();

        if (texto.isEmpty()) {
            System.out.println("Ingresa una cantidad");
            return;
        }

        try {
            double monto = Double.parseDouble(texto);
            System.out.println("Depositaste: $" + monto);

            // limpiar campo
            txtDeposito.clear();

        } catch (NumberFormatException e) {
            System.out.println("Solo números válidos");
        }
    }
}
