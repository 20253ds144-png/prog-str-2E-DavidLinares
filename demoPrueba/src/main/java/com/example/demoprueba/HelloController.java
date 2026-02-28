package com.example.demoprueba;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtPassword;
    @FXML private Label lblMensaje;

    @FXML
    protected void onLoginClick() {
        String correo = txtUsuario.getText();
        String contra = txtPassword.getText();

        if (correo.length() < 4) {
            lblMensaje.setText("Usuario muy corto (mín. 4)");
            return;
        }
        if (!correo.contains("@") || !correo.contains(".")) {
            lblMensaje.setText("Correo no válido (falta @ o .)");
            return;
        }
        if (contra.length() < 6) {
            lblMensaje.setText("Contraseña muy corta (mín. 6)");
            return;
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) txtUsuario.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Dashboard - Bienvenido");
            stage.show();
        } catch (IOException e) {
            lblMensaje.setText("No se pudo cargar el Dashboard");
        }
    }

}