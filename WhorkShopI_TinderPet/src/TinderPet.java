import java.util.ArrayList;
import java.util.List;

import pkMascota.Mascota;
import pkPersona.Propietario;

public class TinderPet {
    public static void main(String[] args) throws Exception {
        List <Mascota> lsMascota = new ArrayList<>();
        Mascota m1 = new Mascota("Juan", "Perro", "Pitbull", 2, true, new Propietario("Esteban", 20, "Hombre"), "Raza pura");
        Mascota m2 = new Mascota("Lucia", "Perra", "San Bernardo", 1, true, new Propietario("Pepe", 25, "Hombre"), "Raza pura");
        Mascota m3 = new Mascota("Don gato", "Gato", "Comun europeo", 1, true, new Propietario("Auron", 30, "Hombre"), "Dormilon");
        Mascota m4 = new Mascota("Molly", "Gata", "Persa", 1, true, new Propietario("Maria", 40, "Muejer"), "Muy mimada");
        Mascota m5 = new Mascota("Pepe", "Perico", "Opalino", 3, true, new Propietario("Claudia", 32, "Mujer"), "raza pura");
        Mascota m6 = new Mascota("Nila", "Perica", "Opalino", 2, true, new Propietario("Pepe", 25, "Hombre"), "raza pura");
        m1.mostrarMascota();
    }
}
