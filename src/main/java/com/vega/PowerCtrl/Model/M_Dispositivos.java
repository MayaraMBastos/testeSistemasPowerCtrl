package com.vega.PowerCtrl.Model;

import jakarta.persistence.*;

@Entity
@Table (name = "dispositivos")
public class M_Dispositivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_dispositivo;

    private String nome_setor;

    private String cod_dispositivo;

    private Long id_usuario;

    private Double consumoDiario;

    public M_Dispositivos() {
    }

    public Long getId_dispositivo() {
        return id_dispositivo;
    }

    public void setId_dispositivo(Long id_dispositivo) {
        this.id_dispositivo = id_dispositivo;
    }

    public String getNome_setor() {
        return nome_setor;
    }

    public void setNome_setor(String nome_setor) {
        this.nome_setor = nome_setor;
    }

    public String getCod_dispositivo() {
        return cod_dispositivo;
    }

    public void setCod_dispositivo(String cod_dispositivo) {
        this.cod_dispositivo = cod_dispositivo;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(Double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }
}
