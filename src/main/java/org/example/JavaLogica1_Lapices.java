package org.example;

import java.util.Scanner;

public class JavaLogica1_Lapices {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);

        System.out.print("Leer un número N seguido por un dígito K, separado por un espacio => [N K]: ");
        String strInput = stringScanner.nextLine();

        String[] arrayOfString = strInput.split("\\s+");
        int numeroVeces = Integer.parseInt(arrayOfString[0]);
        int numeroBuscar = Integer.parseInt(arrayOfString[1]);

        int frecuencia = 0 ;
        for(int i=1; i<=numeroVeces; i++){
            int lecturaEntero = stringScanner.nextInt();
            if(lecturaEntero==numeroBuscar){
                frecuencia++;
            }
        }

        System.out.println(" Salida : "+frecuencia);
    }
}