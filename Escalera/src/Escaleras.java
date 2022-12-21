import java.util.Scanner;

public class Escaleras {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int tamanio;

        System.out.println("Ingrese el tamanio del cuadrado: ");
        tamanio = leer.nextInt();

        for(int i = 0; i < tamanio; i++){
            for(int j = 0; j < tamanio; j++){
                if(i == 0 || j == 0 )
                    System.out.println("xd");
            }
        }


        /* programa de la escalera
        int niveles;

        System.out.println("Ingrese los niveles que tendra la escalera: ");
        niveles = leer.nextInt();

        for(int i = 0; i < niveles; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
                System.out.print("|");
            }
            System.out.println("___");
        }
        */

    }
}
