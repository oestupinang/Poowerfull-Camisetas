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
public class Usuario {

    public Usuario(String nombre, String tipoUsuario, String correo, String telefono) {
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String nombre;
    public String tipoUsuario;
    public String correo;
    public String telefono;
    public String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void editarPerfil() {
        
    }
    public void iniciarSesion() {
        
    }
    public void cambiarClave() {
        
    }
    public void obtenerHistoricoVentas() {
        
    }
}
