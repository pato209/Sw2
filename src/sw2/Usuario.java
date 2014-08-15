/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sw2;

/**
 *
 * @author Rulo209
 */
public class Usuario {
    private Integer id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    
  

    public Usuario(Integer Id, String Nombre, String Telefono, String Direccion, String Email) {
        this.id = Id;
        this.nombre = Nombre;
        this.telefono = Telefono;
        this.direccion = Direccion;
        this.email = Email;
    }

    Usuario() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }
    
    
}
