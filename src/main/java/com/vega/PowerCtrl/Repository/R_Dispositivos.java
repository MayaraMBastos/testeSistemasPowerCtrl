package com.vega.PowerCtrl.Repository;

import com.vega.PowerCtrl.Model.M_Dispositivos;
import com.vega.PowerCtrl.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Dispositivos extends JpaRepository<M_Dispositivos, Long> {
    @Query(value = "SELECT cod_dispositivo FROM dispositivos WHERE cod_dispositivo = :cod_dispositivo  limit 1", nativeQuery = true)
    String findByCodDispositivo(@Param("cod_dispositivo") String cod_dispositivo);

    default boolean seCodDispositivoExiste(String cod_dispositivo) {
        String resultado = findByCodDispositivo(cod_dispositivo);
        return resultado != null;
    }

    @Query(value = "SELECT id_dispositivo FROM dispositivos WHERE id_dispositivo = :id_dispositivo  limit 1", nativeQuery = true)
    Long findByIdDispositivo(@Param("id_dispositivo") Long id_dispositivo);

}

