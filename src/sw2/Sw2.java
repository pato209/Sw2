/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sw2;
import sw2.Pago;
import sw2.Producto;



/**
 *
 * @author Rulo209
 */
public class Sw2 {

    
    public void Pagar(Pago pago) {
        
        String formato = pago.Producto.getFormato();
        String tipo = pago.Producto.getFormato();
        if(formato.equalsIgnoreCase("Fisico")){
            ordenEntrega(pago.Usuario);
            comisionAgente(pago.Valor);
        }
        if(tipo.equalsIgnoreCase("Libro")){
            ordenEntrega(pago.Usuario);
            ordenEntregaDptoLibros(pago.Usuario);
            comisionAgente(pago.Valor);
        }
        if(tipo.equalsIgnoreCase("Membresia")){
            Usuario u = new Usuario();
            pago.Producto.setEstado("Activo");
            emailDueño(u);
        }
        if(tipo.equalsIgnoreCase("Actualizacion Membresia")){
            pago.Usuario.setDireccion(null);
            pago.Usuario.setEmail(null);
            pago.Usuario.setId(null);
            pago.Usuario.setNombre(null);
            pago.Usuario.setTelefono(null);
            emailDueño(pago.Usuario);
            
        }
        if(tipo.equalsIgnoreCase("Video")){
            String nombre = pago.Producto.getNombre();
            if(nombre.equalsIgnoreCase("Aprendiendo a eskiar")){
                Producto primerosAuxilios = new Producto();
                pago.setProducto(primerosAuxilios);
            }
        }

    
    
     
        
   
}
    private void ordenEntrega(Usuario Usuario) {
        System.out.println("Para: " + Usuario.getNombre() + "Identificado con la cedula: "+ Usuario.getId() +"en la Direccion: " + Usuario.getDireccion() );
    }

    private void comisionAgente(Float valor) {
        System.out.println("Comision :" + (valor* 0.15) );
    }

    private void ordenEntregaDptoLibros(Usuario Usuario) {
        System.out.println("Para: " + Usuario.getNombre() + "Identificado con la cedula: "+ Usuario.getId() +"en la Direccion: " + Usuario.getDireccion() );
    }

    private void emailDueño(Usuario Usuario) {
        System.out.println("Enviar correo para: " + Usuario.getEmail() + " Asunto: Actualizacion o activacion de embresia para el usuario :" +  Usuario.getNombre());
    }
    
    
}