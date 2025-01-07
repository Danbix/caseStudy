package com.example.voitureservice.dto;

public class VoitureDto {
    private String modele;
    private String carburant;
    private int annee;
    private String clientId;

    public VoitureDto() {
    }

    public VoitureDto(String modele, String carburant, int annee, String clientId) {
        this.modele = modele;
        this.carburant = carburant;
        this.annee = annee;
        this.clientId = clientId;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
