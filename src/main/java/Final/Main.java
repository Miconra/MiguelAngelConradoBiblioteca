package Final;

import Final.GestionOrden.Biblioteca;

public class Main {
    static void main(String[] args) {

        System.out.println("Registro de libro,revista,digital");
        Libro Libro1 = new Libro("Abecedario", 1970, true, "pablo", "120948023409");
        Libro Libro2 = new Libro("Libro2", 2000, true, "Juanes", "823748973");
        Revista revista1 = new Revista("asdasd", 2030, true, "qhubo", 4);
        Revista revista2 = new Revista("revisae2", 2000, true, "antioquia", 3);
        Digital digital1 = new Digital("sdnvjnsdv",3000,"www.sdnuivsdv");
        Digital digital2 = new Digital("sdnvdsafjnsdv",2005,"www.sdnuivsdv.http");

        Biblioteca biblioteca=new Biblioteca();
        biblioteca.agregarRecurso(Libro1.getCodigo(),Libro1);
        biblioteca.agregarRecurso(Libro2.getCodigo(),Libro2);


    }

}
