package Controlador;

import javax.swing.*;

public class InsertarDatos {
    public JComboBox InsertarCombo(JComboBox combo1) {
        for (int i = 0; i < 4 ; i++) {

            combo1.addItem("Movimiento "+i);

        }

        return combo1;
    }
}
