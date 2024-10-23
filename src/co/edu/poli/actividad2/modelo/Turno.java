package co.edu.poli.actividad2.modelo;

/**
 * 
 */
public class Turno {
    private int id;
    private String fecha;
    private String horaTurno;
    private Cliente cliente;
    private Servicio servicio;
    private boolean estado;
    

    public Turno(int id, String fecha, String horaTurno, Cliente cliente, Mascota mascota, Servicio servicio, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.horaTurno = horaTurno;
        this.cliente = cliente;
        this.servicio = servicio;
        this.estado = estado;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}

    public String getHoraTurno() {return horaTurno;}
    public void setHoraTurno(String horaTurno) {this.horaTurno = horaTurno;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public Servicio getServicio() {return servicio;}
    public void setServicio(Servicio servicio) {this.servicio = servicio;}

    public boolean isEstado() {return estado;}
    public void setEstado(boolean estado) {this.estado = estado;}



    




    public Turno(int id, String fecha, String horaTurno, Cliente cliente, Servicio servicio, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.horaTurno = horaTurno;
        this.cliente = cliente;
        this.servicio = servicio;
        this.estado = estado;
    }

    public void asignarServicio() {
        // TODO implement here
    }

    /**
     * 
     */
    public void confirmarTurno() {
        // TODO implement here
    }

    /**
     * ASASAS
     */
    public void reagendar() {
        // TODO implement here
    }

}