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
public class Controlador {

    
    public void pagar(Pago pago) {
        
        String formato = pago.producto.getFormato();
        String tipo = pago.producto.getTipo();
        if(formato.equalsIgnoreCase("Fisico")){
            ordenEntrega(pago.usuario);
            comisionAgente(pago.valor);
        }
        if(tipo.equalsIgnoreCase("Libro")){
            ordenEntrega(pago.usuario);
            ordenEntregaDptoLibros(pago.usuario);
            comisionAgente(pago.valor);
        }
        if(tipo.equalsIgnoreCase("Membresia")){
            Usuario u = new Usuario();
            pago.producto.setEstado("Activo");
            emailDueño(u);
        }
        if(tipo.equalsIgnoreCase("Actualizacion Membresia")){
            
            pago.usuario.setDireccion(null);
            pago.usuario.setEmail(null);
            pago.usuario.setId(null);
            pago.usuario.setNombre(null);
            pago.usuario.setTelefono(null);
            emailDueño(pago.usuario);
            
        }
        String nombre = pago.producto.getNombre();
        if(tipo.equalsIgnoreCase("Video") && nombre.equalsIgnoreCase("Aprendiendo a eskiar")){
            Producto primerosAuxilios = new Producto();
                pago.setProducto(primerosAuxilios);
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