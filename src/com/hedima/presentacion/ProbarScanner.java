package com.hedima.presentacion;

import java.util.Scanner;

public class ProbarScanner {
    public static void main(String[] args) {
        //Declarar un variable primitiva
        int numero = 10;

        //Declarando un objeto
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero->");
        numero = sc.nextInt();
        System.out.println("El numero es: " + numero);
    }
}
