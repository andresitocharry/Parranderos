package uniandes.edu.co.parranderos.modelo;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFICINAS")
public class Oficina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String direccion;

    private Integer cantidadpuntosatencion;

    private Integer idgerenteoficina;

    private Time horaapertura;

    private Time horacierre;

    
    public Oficina(){
        ;
    }


    public Oficina(String nombre, String direccion, Integer cantidadpuntosatencion, Integer idgerenteoficina,
            Time horaapertura, Time horacierre) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadpuntosatencion = cantidadpuntosatencion;
        this.idgerenteoficina = idgerenteoficina;
        this.horaapertura = horaapertura;
        this.horacierre = horacierre;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


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


    public Integer getCantidadpuntosatencion() {
        return cantidadpuntosatencion;
    }


    public void setCantidadpuntosatencion(Integer cantidadpuntosatencion) {
        this.cantidadpuntosatencion = cantidadpuntosatencion;
    }


    public Integer getIdgerenteoficina() {
        return idgerenteoficina;
    }


    public void setIdgerenteoficina(Integer idgerenteoficina) {
        this.idgerenteoficina = idgerenteoficina;
    }


    public Time getHoraapertura() {
        return horaapertura;
    }


    public void setHoraapertura(Time horaapertura) {
        this.horaapertura = horaapertura;
    }


    public Time getHoracierre() {
        return horacierre;
    }


    public void setHoracierre(Time horacierre) {
        this.horacierre = horacierre;
    }

    
    
    
    
}
