package com.domain.eps.org.domaineps.models;

import jakarta.persistence.*;//3.0

@Entity
public class EpsDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEps;
    @Column
    private String nombreEps;
    @Column
    private double porcentaje;
    @Column
    private double comisionSobreRA;
    @Column
    private double primaSeguro;

    public long getIdEps() {
        return idEps;
    }

    public void setIdEps(int idEps) {
        this.idEps = idEps;
    }

    public String getNombreEps() {
        return nombreEps;
    }

    public void setNombreEps(String nombreEps) {
        this.nombreEps = nombreEps;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getComisionSobreRA() {
        return comisionSobreRA;
    }

    public void setComisionSobreRA(double comisionSobreRA) {
        this.comisionSobreRA = comisionSobreRA;
    }

    public double getPrimaSeguro() {
        return primaSeguro;
    }

    public void setPrimaSeguro(double primaSeguro) {
        this.primaSeguro = primaSeguro;
    }
}
