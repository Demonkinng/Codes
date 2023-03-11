import java.util.Scanner;

public class Horario {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int cantidadDeFilas;
        System.out.println("Bienvenido, ingrese la cantidad de filas que contendra el horario: ");
        cantidadDeFilas = leer.nextInt();
        cantidadDeFilas += 1;
        String[][]  horario= new String[cantidadDeFilas][6];
        String horaActividad = "xd";

        
        llenarHorario(cantidadDeFilas, horario, horaActividad);
        mostrarHorario(cantidadDeFilas, horario, horaActividad);
        
    }

    public static void llenarHorario(int cantidadDeFilas, String[][] horario, String horaActividad){
        for(int f = 0; f < cantidadDeFilas; f++){
            for(int c = 0; c < horario[f].length; c++){
                if(f == 0){
                    if(c == 0){
                        horario[f][c] = "Hora";
                    }
                    if(c == 1){
                        horario[f][c] = "Lunes";
                    }
                    if(c == 2){
                        horario[f][c] = "Martes";
                    }
                    if(c == 3){
                        horario[f][c] = "Miercoles";
                    }
                    if(c == 4){
                        horario[f][c] = "Jueves";
                    }
                    if(c == 5){
                        horario[f][c] = "Viernes";
                    }
                }
                if(f !=0 && c == 0){
                    System.out.println("Ingrese las horas de la Actividad: ");
                    horaActividad = leer.next();
                    horario[f][c] = horaActividad;
                }
                if(f != 0 && c!=0){
                    System.out.println("Ingrese la asignatura en la casilla ["+f+"]["+c+"]: ");
                    horaActividad = leer.next();
                    horario[f][c] = horaActividad;
                }
                //System.out.println("Ingrese el dia a seleccionar: ");
                //seleccionarDia = leer.nextInt();
            }
        }
    }

    public static void mostrarHorario(int cantidadDeFilas, String[][] horario, String horaActividad){
        System.out.println("\n\t\t\t\t\tHORARIO DE CLASES");
        for(int f = 0; f < horario.length; f++){
            System.out.println("-------------------------------------------------------------------------------------------------");
            for(int c = 0; c < horario[f].length; c++){
                System.out.print(String.format("%.7s", "|\t" + horario[f][c]) + "\t");
            }
            System.out.println();
        }
    }

}
 