package org.example;

public class Clasaaa {
    private String name;
    private String cnp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Clasaaa(String name, String cnp, double pret) {
        this.name = name;
        this.cnp = cnp;
        this.pret = pret;
    }

    private double pret;
}
