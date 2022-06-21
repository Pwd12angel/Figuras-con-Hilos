package Controlador;

import Modelo.Hilo1;
import Modelo.Hilo2;
import Modelo.Hilo3;
import Modelo.Hilo4;
import Vista.MiPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AccionBoton implements ActionListener, ItemListener {

    public AccionBoton (){
       // MiPanel.boton.addActionListener(this);
        MiPanel.combo.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == MiPanel.boton){

            System.out.println("Presionado");








        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == MiPanel.combo){
             int op = MiPanel.combo.getSelectedIndex();
                //Instanciamos el hilo
                Hilo1 hilo1 = new Hilo1(op);
                Hilo2 hilo2 = new Hilo2(op);
                Hilo3 hilo3 = new Hilo3(op);
                Hilo4 hilo4 = new Hilo4(op);

                MiPanel.etiqueta1.setBounds(150,120,100,100);
                MiPanel.etiqueta2.setBounds(250,120,100,100);
                MiPanel.etiqueta3.setBounds(150,220,100,100);
                MiPanel.etiqueta4.setBounds(250,220,100,100);

                hilo1.start();
                hilo2.start();
                hilo3.start();
                hilo4.start();
                }




    }
}
