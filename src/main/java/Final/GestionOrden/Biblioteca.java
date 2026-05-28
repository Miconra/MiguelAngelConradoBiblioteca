package Final.GestionOrden;

import Final.Exeptions.noPrestadoAntes1973;
import Final.Exeptions.recursoNoDisponible;
import Final.Exeptions.yaPrestado;
import Final.Recursos;

import java.util.*;

public class Biblioteca {

    private final List<Recursos> baseDatosRecursos;
    private final Map<UUID, Recursos> registroRecursos;

    public Biblioteca() {
        this.baseDatosRecursos = new ArrayList<>();
        this.registroRecursos = new HashMap<>();

    }

    public Recursos obtenerContenido(UUID contenidoId) {
        for (Recursos r : baseDatosRecursos) {
            if (r.getCodigo().equals(contenidoId)) return r;
        }
        throw new recursoNoDisponible("El contenido solicitado no existe en la base de datos.");
    }

    public UUID agregarRecurso(UUID recursoCodigo, Recursos recurso, Object... datos){
        recurso = registroRecursos.get(recursoCodigo);
        if (recurso == null) throw new recursoNoDisponible("El recurso no existe");

        if (recurso.isDisponibilidad()== false) throw new yaPrestado("El recurso ya esta prestado");

        if(recurso.getFecha()<1973) throw new noPrestadoAntes1973("El recurso es muy antiguo para su prestamo");

        try {
            baseDatosRecursos.add(recurso);
            System.out.println("\n[NUEVO Recurso] '" + recurso.getTitulo() + "' Codigo " + recurso.getCodigo());
            return recurso.getCodigo(); // Retornamos el ID
        } catch (recursoNoDisponible e) {
            System.err.println("Error al publicar: " + e.getMessage());
            return null;
        }
    }



}
