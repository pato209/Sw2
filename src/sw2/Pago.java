/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sw2;

import java.util.Date;

/**
 *
 * @author Rulo209
 */
class Pago {
    Float Valor;
    Date Fecha;
    Producto Producto;
    Usuario Usuario;
    
    public Pago(String concepto, Float valor, Date fecha, Producto producto, Usuario usuario) {
        
        this.Valor = valor;
        this.Fecha = fecha;
        this.Producto = producto;
        this.Usuario = usuario;
    }

    public Float getValor() {
        return Valor;
    }

    public void setValor(Float Valor) {
        this.Valor = Valor;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public sw2.Producto getProducto() {
        return Producto;
    }

    public void setProducto(sw2.Producto Producto) {
        this.Producto = Producto;
    }

    public sw2.Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(sw2.Usuario Usuario) {
        this.Usuario = Usuario;
    }
    
}
