package com.mycompany.gastos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txtal;
    @FXML TextField txtrefri;
    @FXML TextField txtauto;
    @FXML TextField txtfon;
    @FXML TextField txtotros;

    @FXML Label lblsemanal;
    @FXML Label lblalto;

    @FXML
    private void btnCalcular_click() {

        int alimentacion = Integer.parseInt(txtal.getText());
        int refrigerios = Integer.parseInt(txtrefri.getText());
        int transporte = Integer.parseInt(txtauto.getText());
        int telefonia = Integer.parseInt(txtfon.getText());
        int otros = Integer.parseInt(txtotros.getText());

        
        int total = alimentacion + refrigerios + transporte
                + telefonia + otros;

        lblsemanal.setText(String.valueOf(total));

        
        int mayor = alimentacion;

        if (refrigerios > mayor) {
            mayor = refrigerios;
        }

        if (transporte > mayor) {
            mayor = transporte;
        }

        if (telefonia > mayor) {
            mayor = telefonia;
        }

        if (otros > mayor) {
            mayor = otros;
        }

        lblalto.setText(String.valueOf(mayor));
    }

    @FXML
    private void btnLimpiar_click() {
        txtal.clear();
        txtrefri.clear();
        txtauto.clear();
        txtfon.clear();
        txtotros.clear();

        lblsemanal.setText("");
        lblalto.setText("");
    }
}
