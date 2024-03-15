package uniandes.edu.co.parranderos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PuntosAtencion")
public class PuntoAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String tipo;

    private Float latitud;

    private Float longitud;

    @ManyToOne
    @JoinColumn(name = "oficinaasociada",referencedColumnName = "id")
    private Oficina oficinaAsociada;

    public PuntoAtencion(){
        ;
    }

    public PuntoAtencion(String tipo, Float latitud, Float longitud, Oficina oficinaAsociada) {
        this.tipo = tipo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.oficinaAsociada = oficinaAsociada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public Oficina getOficinaAsociada() {
        return oficinaAsociada;
    }

    public void setOficinaAsociada(Oficina oficinaAsociada) {
        this.oficinaAsociada = oficinaAsociada;
    }
    
    


    
}
