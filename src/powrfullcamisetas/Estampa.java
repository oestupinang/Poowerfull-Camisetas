/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powrfullcamisetas;

/**
 *
 * @author David
 */
public class Estampa {

    public Estampa(int popularidad, int rating, String autor, TemaEstampa tema, String nombre, double precio, boolean activa) {
        this.popularidad = popularidad;
        this.rating = rating;
        this.autor = autor;
        this.tema = tema;
        this.nombre = nombre;
        this.precio = precio;
        this.activa = activa;
    }
    
    public int popularidad;
    public int rating;
    public String autor;
    public TemaEstampa tema;
    public String nombre;
    public double precio;
    public boolean activa;

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public TemaEstampa getTema() {
        return tema;
    }

    public void setTema(TemaEstampa tema) {
        this.tema = tema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    
}
