package Caperucitaa.src;

import java.util.Scanner;

public class Caperucita {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int opcion;
        int ladoIzquierdo[] = { 1, 1, 1}; // en este caso ubicamos a todos los elementos al lado izquierdo
        int ladoDerecho[] = { 0, 0, 0 }; // en el siguiente array el cero representa nulo
        boolean partida = true; //si es falso el juego termina
        String ubicacionTripulante = "izquierda";

        System.out.println("\nEn la orilla izquierda del rio se encuentran caperucita, el lobo y las uvas."); //suponemos que el viaje inicia del lado derecho
        System.out.println("El objetivo es pasar los 3 objetos al otro lado teniendo en cuenta las siguientes condiciones.");
        System.out.println("Caperucita sola con el lobo, marcha caperucita y si caperucita esta sola con las uvas entonces marchan las uvas.");
        mostrarEstado(ladoIzquierdo, ladoDerecho, ubicacionTripulante);
        while(partida){
            System.out.println("\n1. Lobo, 2. Caperucita, 3. Uvas, 4. Canoa Libre");
            System.out.println("Ingrese una opcion para mover: ");
            opcion = leer.nextInt();
            realizarViaje(opcion, ladoIzquierdo, ladoDerecho);
            mostrarEstado(ladoIzquierdo, ladoDerecho, ubicacionTripulante);
        }
    }

    public static void realizarViaje(int opcion, int ladoIzquierdo[], int ladoDerecho[]){
        switch(opcion){
            case 1: 
                ladoIzquierdo[0] = 0;
                ladoDerecho[0] = 1;
            break;
            case 2:
                ladoIzquierdo[1] = 0;
                ladoDerecho[1] = 1;
            break;
            case 3:
                ladoIzquierdo[2] = 0;
                ladoDerecho[2] = 1;
            break;
        }
        
    }

    public static void verificarEstado(int ladoIzquierdo[], int ladoDerecho[], String ubicacionTripulante){
        for(int i = 0; i < 3; i++){
            if(ladoDerecho[i] == 1){
                ubicacionTripulante = "derecha";
            }else{
                ubicacionTripulante = "izquierda";
            }
        }
    }

    public static void mostrarEstado(int ladoIzquierdo[], int ladoDerecho[], String ubicacionTripulante){
        verificarEstado(ladoIzquierdo, ladoDerecho, ubicacionTripulante);
        System.out.println("\nESTADO DE LOS TRIPULANTES");
        System.out.println("El lobo esta en la " + ubicacionTripulante);
        System.out.println("La caperucita esta en la " + ubicacionTripulante);
        System.out.println("Las uvas estan en la " + ubicacionTripulante);
    }
}
