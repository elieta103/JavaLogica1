package org.example;

import java.util.Scanner;

public class JavaLogica3_Bisiesto {

    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);

        int anio = 0;
        String respuesta = "S";
        do{
            System.out.print("Escribe un año [1600, 3000]: ");
            anio =  stringScanner.nextInt();
        }while(anio < 1600 || anio > 3000);

        if( anio%4 == 0){
            if( anio%100 == 0 ) {
                respuesta = "N";
            }
            if(anio%100 == 0 && anio%400 == 0){
                respuesta = "S";
            }
        }else{
            respuesta = "N";
        }

        System.out.println(anio + "  "+respuesta);
    }
}