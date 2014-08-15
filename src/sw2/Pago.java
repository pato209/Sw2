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
    Float valor;
    Date fecha;
    Producto producto;
    Usuario usuario;
    
    public Pago(Float valor, Date fecha, Producto producto, Usuario usuario) {
        
        this.valor = valor;
        this.fecha = fecha;
        this.producto = producto;
        this.usuario = usuario;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float Valor) {
        this.valor = Valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date Fecha) {
        this.fecha = Fecha;
    }

    public sw2.Producto getProducto() {
        return producto;
    }

    public void setProducto(sw2.Producto Producto) {
        this.producto = Producto;
    }

    public sw2.Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(sw2.Usuario Usuario) {
        this.usuario = Usuario;
    }
    
}
