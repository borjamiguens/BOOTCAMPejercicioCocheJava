package org.example;

public class Coche {
    private String marca;
    private String modelo;

    private final int MAX_SPEED=190;
    private String tipoCombustible;

    private int  velocimetro=0;
    private int  tacometro=0;

    private boolean encendido=false;


    void arrancar(){
        System.out.println("brmmmmmbrmmmmm");
        encendido=true;
    }

    void apagar(){
        System.out.println("clic stopEngine");
        encendido=false;
    }

    void acelerar(){
        System.out.println("acelerando");
        if(velocimetro<MAX_SPEED){
            velocimetro++;
        }
    }

    void frenar(){
        System.out.println("frenando");
        if(velocimetro>0){
            velocimetro--;
        }
    }
    void girarVolante(String direccion){

        if (direccion.equals("derecha")){
                System.out.println("girar derecha");
        }else   System.out.println("girar izquierda");
    }
    void marchaAtras(){
        System.out.println("para atrás");
        if(velocimetro==0){
            velocimetro --;
        }
    }
}
