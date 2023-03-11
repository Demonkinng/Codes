package pkPersona;

public class Propietario {
    private String nombre;
    private int edad;
    private String genero;

    public Propietario(String nombre, 
                       int edad, 
                       String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void showMe(){
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad: " + edad);
        System.out.println("\tGenero: " + genero);
    }
}
