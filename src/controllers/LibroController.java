package controllers;

import models.Book;

import java.util.*;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparador = (b1, b2) -> {
            int comparadorTitulo = b2.getTitulo().compareTo(b1.getTitulo()); 
            if (comparadorTitulo != 0) return comparadorTitulo;

            return Integer.compare(b1.getAnio(), b2.getAnio()); 
        };

        Map<Book, Book> mapaOrdenado = new TreeMap<>(comparador);

        for (Book libro : libros) {
            mapaOrdenado.put(libro, libro); 
        }

        return mapaOrdenado;
    }
}
