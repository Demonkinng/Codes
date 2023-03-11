package pkMascota;

import pkPersona.Propietario;

public class Mascota {
    private String nombre;
    private String tipo;
    private String raza;
    private int edad;
    private boolean estadoMatch;
    private Propietario propietario;
    private String observacion;

    public Mascota(String nombre, 
                   String tipo, 
                   String raza, 
                   int edad, 
                   boolean estadoMatch, 
                   Propietario propietario, 
                   String observacion){
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.estadoMatch = estadoMatch;
        this.propietario = propietario;
        this.observacion = observacion;
    }

    public void mostrarMascota(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
        System.out.println("EstadoMatch: " + estadoMatch);
        System.out.println("Propietario: " + propietario);
        System.out.println("Observacion: " + observacion);
    }
}
