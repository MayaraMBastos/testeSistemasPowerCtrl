package com.vega.PowerCtrl.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "statusrele")
public class M_StatusRele {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_status;
    private Long id_dispositivo;
    private boolean statusOnOff;
    private Double consumoRealTime;

    public M_StatusRele(Long id_status, Long id_dispositivo, boolean statusOnOff, Double consumoRealTime) {
        this.id_status = id_status;
        this.id_dispositivo = id_dispositivo;
        this.statusOnOff = statusOnOff;
        this.consumoRealTime = consumoRealTime;
    }

    public Long getId_status() {
        return id_status;
    }

    public void setId_status(Long id_status) {
        this.id_status = id_status;
    }

    public Long getId_dispositivo() {
        return id_dispositivo;
    }

    public void setId_dispositivo(Long id_dispositivo) {
        this.id_dispositivo = id_dispositivo;
    }

    public boolean isStatusOnOff() {
        return statusOnOff;
    }

    public void setStatusOnOff(boolean statusOnOff) {
        this.statusOnOff = statusOnOff;
    }

    public Double getConsumoRealTime() {
        return consumoRealTime;
    }

    public void setConsumoRealTime(Double consumoRealTime) {
        this.consumoRealTime = consumoRealTime;
    }
}
