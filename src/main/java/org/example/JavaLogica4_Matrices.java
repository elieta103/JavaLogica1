package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLogica4_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matriz cuadrada N x N  Numero de renglones ó columnas => ");
        int renglonesColumnas = scanner.nextInt();
        int contador=0;
        List<String> matriz = new ArrayList<>();
        String respuesta = "";

        String linea = scanner.nextLine();
        while (scanner.hasNextLine()) {
            linea = scanner.nextLine();
            matriz.add(linea);
            contador++;
            linea="";

            if (contador == renglonesColumnas) {
                //System.out.println("Matriz capturada : " + matriz);
                break;
            }
        }

        int elementoValidar = 0;
        int elementoActual = 0;
        for(int i=0; i<matriz.size(); i++) {
            String[] arrayOfString =  matriz.get(i).split("\\s+");
            if (i == 0){
                elementoValidar = Integer.parseInt(arrayOfString[0]);
            }
            elementoActual = Integer.parseInt(arrayOfString[i]);

            if(elementoValidar==elementoActual) {
                respuesta="SI";
            }else {
                respuesta="NO";
                break;
            }
        }

        System.out.println(respuesta);

    }


}