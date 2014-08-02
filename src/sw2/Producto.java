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
    private String Nombre;
    private String Tipo;
    private String Formato;
    private String Estado;
    
    public Producto(String nombre, String tipo, String formato, String estado ){
        this.Nombre = nombre;
        this.Tipo = tipo;
        this.Formato = formato;
        this.Estado = estado;
    }

    Producto() {
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
   
}
