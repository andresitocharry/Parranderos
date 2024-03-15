package uniandes.edu.co.parranderos.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.parranderos.modelo.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value = "SELECT * FROM USUARIOS", nativeQuery =  true)
    Collection<Usuario> darUsuarios();
     
    
    @Query(value = "SELECT * FROM USUARIOS WHERE id = :id", nativeQuery = true)
        Usuario darUsuario(@Param("id") int id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO USUARIOS (id, login, clave, rol, numeroidentificacion, tipoidentificacion, nombre, nacionalidad, direccionfisica, direccionelectronica, telefono, ciudad, departamento, codigopostal, esempleado, escliente) " +
                   "VALUES (BANCANDESSEQUENCE.nextval, :login, :clave, :rol, :numeroidentificacion, :tipoidentificacion, :nombre, :nacionalidad, :direccionfisica, :direccionelectronica, :telefono, :ciudad, :departamento, :codigopostal, :esempleado, :escliente)",
           nativeQuery = true)
    void insertarUsuario(
                         @Param("login") String login,
                         @Param("clave") String clave,
                         @Param("rol") String rol,
                         @Param("numeroidentificacion") String numeroidentificacion,
                         @Param("tipoidentificacion") String tipoidentificacion,
                         @Param("nombre") String nombre,
                         @Param("nacionalidad") String nacionalidad,
                         @Param("direccionfisica") String direccionfisica,
                         @Param("direccionelectronica") String direccionelectronica,
                         @Param("telefono") Integer telefono,
                         @Param("ciudad") String ciudad,
                         @Param("departamento") String departamento,
                         @Param("codigopostal") String codigopostal,
                         @Param("esempleado") Boolean esempleado,
                         @Param("escliente") Boolean escliente);


    @Modifying
    @Transactional
    
    @Query(value = "UPDATE USUARIOS SET id = :id, login = :login, clave = :clave, rol = :rol, numeroidentificacion = :numeroidentificacion, tipoidentificacion = :tipoidentificacion, nombre = :nombre, nacionalidad = :nacionalidad, direccionfisica = :direccionfisica, direccionelectronica = :direccionelectronica, telefono = :telefono, ciudad = :ciudad,departamento = :departamento, codigopostal = :codigopostal, esempleado = :esempleado, ESCLIENTE = :escliente WHERE id = :id", nativeQuery = true)
    void actualizarUsuario(
                        @Param("id") int id,
                        @Param("login") String login,
                         @Param("clave") String clave,
                         @Param("rol") String rol,
                         @Param("numeroidentificacion") String numeroidentificacion,
                         @Param("tipoidentificacion") String tipoidentificacion,
                         @Param("nombre") String nombre,
                         @Param("nacionalidad") String nacionalidad,
                         @Param("direccionfisica") String direccionfisica,
                         @Param("direccionelectronica") String direccionelectronica,
                         @Param("telefono") Integer telefono,
                         @Param("ciudad") String ciudad,
                         @Param("departamento") String departamento,
                         @Param("codigopostal") String codigopostal,
                         @Param("esempleado") Boolean esempleado,
                         @Param("escliente") Boolean escliente);
    
    @Modifying
    @Transactional
    @Query(value="DELETE FROM USUARIOS WHERE ID = :id", nativeQuery = true)
    void borrarUsuario(@Param("id") int id);

    
} 