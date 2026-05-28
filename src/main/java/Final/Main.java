package Final;

import Final.GestionOrden.Biblioteca;

import java.util.UUID;

public class Main {
    static void main(String[] args) {
        // ESCENARIO 2: Gestión de Usuarios y Canales
        System.out.println(">> ESCENARIO 2: Registro de Usuarios y Creación de Canales");
        Libro Libro1 = new Libro("Abecedario",1970,true,"pablo","120948023409");
        Libro Libro2 = new Libro("Libro2",2000,true,"Juanes","823748973");

        UUID idLibro1 = Libro1.getCodigo();



        System.out.println();
    }
}
