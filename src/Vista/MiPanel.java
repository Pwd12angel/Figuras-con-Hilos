package Vista;

import Controlador.AccionBoton;
import Controlador.InsertarDatos;

import javax.swing.*;
import java.awt.*;

public class MiPanel extends JPanel {
    public static JButton boton;
    public static JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4;
    public static JComboBox combo;


    public MiPanel(){
        this.setLayout(null);

        CreateLable();
       // CrearBoton();
        CrearCombo();
        AccionBoton instancia = new AccionBoton();

    }

    private void CrearCombo() {
        combo = new JComboBox();
        combo.setBounds(400,0,100,30);
        combo = new InsertarDatos().InsertarCombo(combo);

        this.add(combo);
    }

    private void CrearBoton() {
        boton = new JButton("Iniciar");
        boton.setBounds(400,0,100,30);
        this.add(boton);
    }

    private void CreateLable() {
        etiqueta1 = new JLabel();
        etiqueta2 = new JLabel();
        etiqueta3 = new JLabel();
        etiqueta4 = new JLabel();


        etiqueta1.setBounds(150,120,100,100);
        ImageIcon img1 = new ImageIcon(getClass().getResource("Imagenes/Cuadrado.png"));
        ImageIcon icon2 = new ImageIcon(img1.getImage().getScaledInstance(etiqueta1.getWidth(),etiqueta1.getHeight(), Image.SCALE_DEFAULT));
        etiqueta1.setIcon(icon2);

        etiqueta2.setBounds(250,120,100,100);
        ImageIcon icon3 = new ImageIcon(img1.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(), Image.SCALE_DEFAULT));
        etiqueta2.setIcon(icon3);

        etiqueta3.setBounds(150,220,100,100);
        ImageIcon icon4 = new ImageIcon(img1.getImage().getScaledInstance(etiqueta1.getWidth(),etiqueta1.getHeight(), Image.SCALE_DEFAULT));
        etiqueta3.setIcon(icon4);

        etiqueta4.setBounds(250,220,100,100);
        ImageIcon icon5 = new ImageIcon(img1.getImage().getScaledInstance(etiqueta1.getWidth(),etiqueta1.getHeight(), Image.SCALE_DEFAULT));
        etiqueta4.setIcon(icon5);

        this.add(etiqueta1);
        this.add(etiqueta2);
        this.add(etiqueta3);
        this.add(etiqueta4);
    }


}
