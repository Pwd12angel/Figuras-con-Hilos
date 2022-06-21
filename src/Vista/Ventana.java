package Vista;

import javax.swing.*;

public class Ventana extends JFrame{

    public Ventana(){
        this.setSize(500,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Mi primera ventana");
        this.setVisible(true);

        colocarPanel();
    }


    private void colocarPanel() {
        MiPanel instancia = new MiPanel();
        this.setContentPane(instancia);
    }
}
