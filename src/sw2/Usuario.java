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
    private Integer Id;
    private String Nombre;
    private String Telefono;
    private String Direccion;
    private String Email;
    
  

    public Usuario(Integer Id, String Nombre, String Telefono, String Direccion, String Email) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Email = Email;
    }

    Usuario() {
        
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
