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
public class Pago {
    public String identificacion;
    public String formaPago;

    public Pago(String identificacion, String formaPago) {
        this.identificacion = identificacion;
        this.formaPago = formaPago;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    public void calcularPago(){
        
    }
    public void obtenerCamisetas(){
        
    }
}
