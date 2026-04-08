package com.example.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ControllerWithdraw {

    @FXML
    private TextField txtMonto; // Este es el ID que pusiste en Scene Builder

    // Método para realizar el retiro
    @FXML
    void onRetirarClick(ActionEvent event) {
        String montoStr = txtMonto.getText();

        try {
            double monto = Double.parseDouble(montoStr);

            if (monto > 0) {
                // Aquí iría tu lógica de restar el saldo
                mostrarAlerta("Éxito", "Has retirado: $" + monto);
            } else {
                mostrarAlerta("Error", "Introduce un monto válido mayor a 0.");
            }

        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Por favor, ingresa solo números.");
        }
    }

    // Método para el botón "Regresar al Menú"
    @FXML
    void onRegresarClick(ActionEvent event) {
        // Aquí puedes poner el código para cambiar de escena de vuelta al menú principal
        System.out.println("Regresando al menú...");
    }

    // Función auxiliar para mostrar mensajes
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}