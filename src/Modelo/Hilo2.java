package Modelo;

import Vista.MiPanel;

public class Hilo2 extends Thread{

    int x;

    public Hilo2(int x) {
        this.x = x;
    }


    public void run() {
        switch (x){
            case 1:
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 120; i > 0 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta2.setBounds(250,i,100,100);
                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 0; i < 120 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta2.setBounds(250,i,100,100);
                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 2:
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 120; i > 0 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta2.setBounds(250,i,100,100);
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
                        MiPanel.etiqueta2.setBounds(i,0,100,100);
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
                        MiPanel.etiqueta2.setBounds(i,0,100,100);
                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 0; i < 120 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta2.setBounds(250,i,100,100);
                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3:
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 120; i > 0 ; i--) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta2.setBounds(250,i,100,100);
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
                        MiPanel.etiqueta2.setBounds(i,0,100,100);
                        //  MiPanel.etiqueta1.setLocation(i,0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Movemos los pixels para que se mueva el carrito por la ventana
                for (int i = 0; i < 120 ; i++) {
                    //Temporizador para que se mueva la imagen
                    try {
                        sleep(10);
                        //haremos referencia para mover las coordenadas
                        MiPanel.etiqueta2.setBounds(150,i,100,100);
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
