package org.example;

import java.util.Scanner;

public class JavaLogica2_Segundos {
    public static final int SEGUNDOS_POR_MINUTO = 60;

    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);

        int minutos = 0;
        do{
            System.out.print("Escribir cantidad de minutos entre [1, 100]: ");
            minutos =  stringScanner.nextInt();
        }while(minutos >100 || minutos < 1);

        int segundos = minutos * SEGUNDOS_POR_MINUTO;

        System.out.println(" Segundos : "+segundos);
    }
}