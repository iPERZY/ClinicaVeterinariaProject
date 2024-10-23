package co.edu.poli.actividad2.modelo;



/**
 * 
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private Mascota[ ] mascota;

    public Cliente(String nombre, String direccion, String telefono, Mascota[] mascota) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mascota = mascota;
    }

    public void prepararMascota() {
        // TODO implement here
    }

    /**
     * 
     */
    public void seleccionaTurno() {
        // TODO implement here
    }

    
  // getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Mascota[] getMascota() {
        return mascota;
    }

    public void setMascota(Mascota[] mascota) {
        this.mascota = mascota;
    }
    
    //To String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", telefono=").append(telefono);
        sb.append(", mascota=").append(mascota);
        sb.append('}');
        return sb.toString();
    }

    //constructores



    

}