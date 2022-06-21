package Modelo;

import Vista.MiPanel;

public class Hilo4 extends Thread{
    int x;

    public Hilo4(int x) {
        this.x = x;
    }
    public void run() {
        switch (x){
            case 1:
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 250; i < 364 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta4.setBounds(i,220,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 364; i > 250 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta4.setBounds(i,220,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                break;
            case 2:
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 250; i < 385 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta4.setBounds(i,220,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 220; i > 120  ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta4.setBounds(385,i,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 120; i < 220  ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta4.setBounds(385,i,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 385; i > 250 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta4.setBounds(i,220,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3:
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 250; i < 385 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta4.setBounds(i,220,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 220; i > 120  ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta4.setBounds(385,i,100,100);

                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 385; i > 250 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta4.setBounds(i,120,100,100);

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
