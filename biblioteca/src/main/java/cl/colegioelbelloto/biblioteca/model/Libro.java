package cl.colegioelbelloto.biblioteca.model;

import jakarta.persistence.*;
import  lombok.NonNull;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ⚡ genera el ID en la BD
    private Long idLibro;
    @NonNull
    private String titulo;
    @NonNull
    private String autor;
    @NonNull
    @Column(unique = true) // para que no se repitan
    private String isbn;
    private Integer anioPublicacion;
    private Integer stock;

    public Libro() {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public @NonNull String getIsbn() {
        return isbn;
    }

    public void setIsbn(@NonNull String isbn) {
        this.isbn = isbn;
    }

    public @NonNull String getAutor() {
        return autor;
    }

    public void setAutor(@NonNull String autor) {
        this.autor = autor;
    }

    public @NonNull String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NonNull String titulo) {
        this.titulo = titulo;
    }

    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }
}

