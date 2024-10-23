package co.edu.poli.actividad3.vista;
import co.edu.poli.actividad2.modelo.Cliente;
import co.edu.poli.actividad2.modelo.CostoServicio;
import co.edu.poli.actividad2.modelo.DuracionServicio;
import co.edu.poli.actividad2.modelo.Mascota;
import co.edu.poli.actividad2.modelo.Servicio;
import co.edu.poli.actividad2.modelo.ServicioEspecial;
import co.edu.poli.actividad2.modelo.ServicioNormal;
/**
 * 
 */
public class Principal {

    /**
     * Default constructor
     */
    public Principal() {
    }

    /**
     * @param args 
     * @return
     */
    public static void main(String[ ] args) {
        
        CostoServicio costoNormal = new CostoServicio ("COP", 20.0);
        CostoServicio costoEspecial = new CostoServicio ("COP", 100.0);

        DuracionServicio min = new DuracionServicio("20", "min");
        DuracionServicio hora = new DuracionServicio("2", "h");

        ServicioNormal aaaa = new ServicioNormal("SN1", "Consulta B", "BASICO", 20.0, costoNormal, 0.0);
        ServicioEspecial bbbb = new ServicioEspecial("SE1", "Cirugias", costoEspecial, 100.0);

        Mascota mascota1 = new Mascota("HACHI", "Snauser", "5 años", 20.0, "cafe", false, false);
        Mascota[] mascotas = new Mascota[5];
        mascotas[0]= mascota1;

        Cliente cliente1 = new Cliente("Edgar", "Soledad", "3187624084", mascotas);

        Cliente[] Clientes = new Cliente[5];
        Clientes[0] = cliente1;
        

        aaaa.setDuracion(hora);
        bbbb.setDuracion(min);

        



        Servicio[] servicios = new Servicio[2];
        servicios[0] = aaaa;
        servicios[1] = bbbb;


        for (Servicio servicio : servicios) {
            if (servicio != null) {
                System.out.println();
                servicio.mostrarDetalles();
                System.out.println(servicio);
            }
        }
        System.out.println();






    }

}