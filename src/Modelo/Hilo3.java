package Modelo;

import Vista.MiPanel;

public class Hilo3 extends Thread{
    int x;

    public Hilo3(int x) {
        this.x = x;
    }
    public void run() {
        switch (x){
            case 1:
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 220; i < 364 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta3.setBounds(150,i,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                for (int i = 364; i > 220 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta3.setBounds(150,i,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                break;
            case 2:
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 220; i < 364 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta3.setBounds(150,i,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 150; i < 250 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta3.setBounds(i,364,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 250; i > 150 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta3.setBounds(i,364,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 364; i > 220 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta3.setBounds(150,i,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3:
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 220; i < 364 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta3.setBounds(150,i,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 150; i < 250 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta3.setBounds(i,364,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 364; i > 220 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta3.setBounds(250,i,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }
    }
}
