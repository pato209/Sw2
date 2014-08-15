/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sw2;

/**
 *
 * @author Rulo209
 */
class Producto {
    private String nombre;
    private String tipo;
    private String formato;
    private String estado;
    
    public Producto(String nombre, String tipo, String formato, String estado ){
        this.nombre = nombre;
        this.tipo = tipo;
        this.formato = formato;
        this.estado = estado;
    }

    Producto() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String Formato) {
        this.formato = Formato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }
   
}
