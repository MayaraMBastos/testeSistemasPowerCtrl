package com.vega.PowerCtrl.Repository;

import com.vega.PowerCtrl.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface R_Cadastro extends JpaRepository<M_Usuario, Long> {

    @Query(value = "SELECT * FROM cadastrousuarios WHERE usuario = :usuario and senha = :senha limit 1", nativeQuery = true)
    M_Usuario findByUsuarioESenha(@Param("usuario") String nome, @Param("senha") String senha);
}
