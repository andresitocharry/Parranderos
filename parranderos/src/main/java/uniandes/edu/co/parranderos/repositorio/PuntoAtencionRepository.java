package uniandes.edu.co.parranderos.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.parranderos.modelo.PuntoAtencion;

public interface PuntoAtencionRepository  extends JpaRepository<PuntoAtencion,Integer>{
    @Query(value = "SELECT * FROM PUNTOSATENCION", nativeQuery =  true)
    Collection<PuntoAtencion> darPuntosAtencion();

    @Query(value = "SELECT * FROM PUNTOSATENCION WHERE id = :id", nativeQuery = true)
        PuntoAtencion darPuntoAtencion(@Param("id") long id);

    @Modifying
        @Transactional
        @Query(value = "INSERT INTO PUNTOSATENCION (ID, TIPO, LATITUD, LONGITUD, OFICINAASOCIADA) VALUES (BANCANDESSEQUENCE.nextval, :tipo, :latitud, :longitud, :oficinaAsociada)", nativeQuery = true)
        void insertarPuntoAtencion(@Param("tipo") String tipo, @Param("latitud") double latitud,
                                    @Param("longitud") double longitud, @Param("oficinaAsociada") int oficinaAsociada);


    @Modifying
    @Transactional
    @Query(value = "UPDATE PUNTOSATENCION SET TIPO = :tipo, LATITUD = :latitud, LONGITUD = :longitud, OFICINAASOCIADA = :oficinaAsociada WHERE ID = :id", nativeQuery = true)
    void actualizarPuntoAtencion(@Param("id") int id, @Param("tipo") String tipo, @Param("latitud") double latitud,
                        @Param("longitud") double longitud, @Param("oficinaAsociada") int oficinaAsociada);

    @Modifying
    @Transactional
    @Query(value="DELETE FROM PUNTOSATENCION WHERE ID = :id", nativeQuery = true)
    void borrarPuntoAtencion(@Param("id") int id);
}
