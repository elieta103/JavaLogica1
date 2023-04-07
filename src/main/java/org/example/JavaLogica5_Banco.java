package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLogica5_Banco {
    public static final String LLEGADA_CLIENTE = "C";
    public static final String SORTEO_CLIENTE = "S";
    public static final String ATENCION_CLIENTE = "A";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de eventos => ");
        int numeroEventos = scanner.nextInt();
        int contador=0;
        List<String> matriz = new ArrayList<>();
        String respuesta = "";

        String linea = scanner.nextLine();
        while (scanner.hasNextLine()) {
            linea = scanner.nextLine();
            matriz.add(linea);
            contador++;
            linea="";

            if (contador == numeroEventos) {
                System.out.println("Eventos capturados : " + matriz);
                break;
            }
        }

        for(int i=0; i<matriz.size(); i++) {
            String[] arrayOfString =  matriz.get(i).split("\\s+");
            if(arrayOfString[0].equals(SORTEO_CLIENTE)){  // SI ES SORTEO REASIGNA PRIORIDADES
                String letraInicial = arrayOfString[1];
                int prioridad = Integer.parseInt(arrayOfString[2]);
                for(int j=0; j<i; j++){
                    String[] cambiarPrioridades =  matriz.get(j).split("\\s+");
                    if(cambiarPrioridades[1].startsWith(letraInicial)){
                        String nuevaPrioridad =  Integer.parseInt(cambiarPrioridades[2])+prioridad+"";
                        cambiarPrioridades[0] = cambiarPrioridades[0];
                        cambiarPrioridades[1] = cambiarPrioridades[1];
                        cambiarPrioridades[2] = nuevaPrioridad;
                        matriz.set(j, cambiarPrioridades[0]+" "+cambiarPrioridades[1]+" "+cambiarPrioridades[2]);
                        matriz.remove(i);
                    }
                }
            }
        }

        System.out.println("Nuevas prioridades : "+matriz);

        int indiceMayor = 0;
        int size = matriz.size();

        for(int i=0; i<size; i++) {
            String[] arrayOfString =  matriz.get(i).split("\\s+");
            if(arrayOfString[0].equals(ATENCION_CLIENTE)) {  // SI ES ATENCION A CLIENTES IMPRIME CLIENTE Y REMUEVE EVENTO DE ATENCION
                for(int j=0; j<i ; j++){
                    if(j+1 < i ) {
                        String[] cliente1 =  matriz.get(j).split("\\s+");
                        String[] cliente2 = matriz.get(j+1).split("\\s+");

                        int value1 = Integer.parseInt(cliente1[2]);
                        int value2 = Integer.parseInt(cliente2[2]);

                        //Indice del mayor
                        if(value1 > value2 ){
                            indiceMayor = j;
                        }else{
                            indiceMayor = j+1;
                        }
                    }
                }
                String[] mayor =  matriz.get(indiceMayor).split("\\s+");
                System.out.println("Cliente atendido : "+mayor[1]);
                matriz.remove(i);
                matriz.remove(indiceMayor);
                // System.out.println("Atencion : "+matriz);

                if (i < size) {
                    size = matriz.size();
                    i = 0;
                }
            }
        }




    }


}