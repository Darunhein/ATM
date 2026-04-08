package com.example.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerConsult {

    private double saldo = 1000.0;
    @FXML
    private Label lblSaldo;
    @FXML
    void consultarSaldo(ActionEvent event) {
        lblSaldo.setText("Saldo actual: $" +saldo);
    }




}
