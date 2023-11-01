package com.vega.PowerCtrl.Model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table( name = "consumo")
public class M_Consumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_consumo;
    private String cod_dispositivo;
    private Date dia_data;
    private Time horario_on;
    private Time horario_off;
    private Double consumoDiario;

    public M_Consumo(Long id_consumo, String cod_dispositivo, Date dia_data, Time horario_on, Time horario_off, Double consumoDiario) {
        this.id_consumo = id_consumo;
        this.cod_dispositivo = cod_dispositivo;
        this.dia_data = dia_data;
        this.horario_on = horario_on;
        this.horario_off = horario_off;
        this.consumoDiario = consumoDiario;
    }

    public Long getId_consumo() {
        return id_consumo;
    }

    public void setId_consumo(Long id_consumo) {
        this.id_consumo = id_consumo;
    }

    public String getCod_dispositivo() {
        return cod_dispositivo;
    }

    public void setCod_dispositivo(String cod_dispositivo) {
        this.cod_dispositivo = cod_dispositivo;
    }

    public Date getDia_data() {
        return dia_data;
    }

    public void setDia_data(Date dia_data) {
        this.dia_data = dia_data;
    }

    public Time getHorario_on() {
        return horario_on;
    }

    public void setHorario_on(Time horario_on) {
        this.horario_on = horario_on;
    }

    public Time getHorario_off() {
        return horario_off;
    }

    public void setHorario_off(Time horario_off) {
        this.horario_off = horario_off;
    }

    public Double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(Double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }
}
