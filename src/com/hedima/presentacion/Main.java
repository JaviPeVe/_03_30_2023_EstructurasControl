package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {

        //Decir si un número esta entre 0 y 100
        int numero = 68;
        if(numero >= 0 && numero <= 100) {
            System.out.println("El número esta entre 0 y 100");       }
        else {
            System.out.println("El número no esta entre 0 y 100");
        }

        //Los articulos ratón y teclados tienen el 10% de descuento
        String nombreArticulo = "Raton";
        double descuento = 0.1, precio = 20;

        if(nombreArticulo.equalsIgnoreCase("raton") || nombreArticulo.toLowerCase().equals("teclado")) {
            System.out.println("El descuento es: "+descuento*precio);
        }else {
            System.out.println("No tiene descuento");
        }

    }
}