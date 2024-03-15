package uniandes.edu.co.parranderos.repositorio;

import java.sql.Time;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.parranderos.modelo.Oficina;

public interface OficinaRepository extends JpaRepository<Oficina,Integer>{
      @Query(value = "SELECT * FROM OFICINAS", nativeQuery =  true)
    Collection<Oficina> darOficinas();

    @Query(value = "SELECT * FROM OFICINAS WHERE id = :id", nativeQuery = true)
        Oficina darOficina(@Param("id") long id);


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO OFICINAS (ID, NOMBRE, DIRECCION, CANTIDADPUNTOSATENCION, IDGERENTEOFICINA, HORAAPERTURA, HORACIERRE) VALUES (BANCANDESSEQUENCE.nextval, :nombre, :direccion, :cantidadPuntosAtencion, :idGerenteOficina, :horaApertura, :horaCierre)", nativeQuery = true)
    void insertarOficina(@Param("nombre") String nombre, @Param("direccion") String direccion,
                        @Param("cantidadPuntosAtencion") int cantidadPuntosAtencion, @Param("idGerenteOficina") int idGerenteOficina,
                        @Param("horaApertura") Time horaApertura, @Param("horaCierre") Time horaCierre);


    @Modifying
    @Transactional
    @Query(value = "UPDATE OFICINAS SET ID = :id, NOMBRE = :nombre, DIRECCION = :direccion, CANTIDADPUNTOSATENCION = :cantidadPuntosAtencion, IDGERENTEOFICINA = :idGerenteOficina, HORAAPERTURA = :horaApertura, HORACIERRE = :horaCierre WHERE ID = :id", nativeQuery = true)
    void actualizarOficina(@Param("id") int id, @Param("nombre") String nombre, @Param("direccion") String direccion,
                                            @Param("cantidadPuntosAtencion") int cantidadPuntosAtencion, @Param("idGerenteOficina") int idGerenteOficina,
                                            @Param("horaApertura") Time horaApertura, @Param("horaCierre") Time horaCierre);
    
     @Modifying
    @Transactional
    @Query(value="DELETE FROM OFICINAS WHERE ID = :id", nativeQuery = true)
    void borrarOficina(@Param("id") int id);
                        
}
