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
public class Camiseta {

    public Camiseta(String talla, String color, String material, double valorTexto, boolean activa) {
        this.talla = talla;
        this.color = color;
        this.material = material;
        this.valorTexto = valorTexto;
        this.activa = activa;
    }
    
    public String talla;
    public String color;
    public String material;
    public double valorTexto;
    public boolean activa;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getValorTexto() {
        return valorTexto;
    }

    public void setValorTexto(double valorTexto) {
        this.valorTexto = valorTexto;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    public void obtenerPosiciones(){
        
    }
    public void agregarEstampa(){
        
    }
    public void agregarTexto(){
        
    }
}
