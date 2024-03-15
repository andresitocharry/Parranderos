package uniandes.edu.co.parranderos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USUARIOS")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String login;

    private String clave;

    private String rol;
    
    private String numeroidentificacion;

    private String tipoidentificacion;

    private String nombre;

    private String nacionalidad;

    private String direccionfisica;

    private String direccionelectronica;

    private Integer telefono;

    private String ciudad;

    private String departamento;

    private String codigopostal;

    private Boolean esempleado;

    private Boolean escliente;

    public Usuario(){
        ;
    }

    public Usuario(String login, String clave, String rol, String numeroidentificacion, String tipoidentificacion,
            String nombre, String nacionalidad, String direccionfisica, String direccionelectronica, Integer telefono,
            String ciudad, String departamento, String codigopostal, Boolean esempleado, Boolean escliente) {
        this.login = login;
        this.clave = clave;
        this.rol = rol;
        this.numeroidentificacion = numeroidentificacion;
        this.tipoidentificacion = tipoidentificacion;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.direccionfisica = direccionfisica;
        this.direccionelectronica = direccionelectronica;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.codigopostal = codigopostal;
        this.esempleado = esempleado;
        this.escliente = escliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public void setNumeroidentificacion(String numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    public String getTipoidentificacion() {
        return tipoidentificacion;
    }

    public void setTipoidentificacion(String tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccionfisica() {
        return direccionfisica;
    }

    public void setDireccionfisica(String direccionfisica) {
        this.direccionfisica = direccionfisica;
    }

    public String getDireccionelectronica() {
        return direccionelectronica;
    }

    public void setDireccionelectronica(String direccionelectronica) {
        this.direccionelectronica = direccionelectronica;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public Boolean getEsempleado() {
        return esempleado;
    }

    public void setEsempleado(Boolean esempleado) {
        this.esempleado = esempleado;
    }

    public Boolean getEscliente() {
        return escliente;
    }

    public void setEscliente(Boolean escliente) {
        this.escliente = escliente;
    }

   
}