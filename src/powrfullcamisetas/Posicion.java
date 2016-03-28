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
public class Posicion {

    public Posicion(String nombre, String radio, String estampa, String texto) {
        this.nombre = nombre;
        this.radio = radio;
        this.estampa = estampa;
        this.texto = texto;
    }

    public String nombre;
    public String radio;
    public String estampa;
    public String texto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getEstampa() {
        return estampa;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
