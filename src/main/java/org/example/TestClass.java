package org.example;

import java.util.ArrayList;

public class TestClass {
    private String name;
    private String altceva;
    private int nuj;
    private ArrayList<String> lista;

    public TestClass(String name, String altceva, int nuj, ArrayList<String> lista) {
        this.name = name;
        this.altceva = altceva;
        this.nuj = nuj;
        this.lista = lista;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAltceva() {
        return altceva;
    }

    public void setAltceva(String altceva) {
        this.altceva = altceva;
    }

    public int getNuj() {
        return nuj;
    }

    public void setNuj(int nuj) {
        this.nuj = nuj;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                ", altceva='" + altceva + '\'' +
                ", nuj=" + nuj +
                ", lista=" + lista +
                '}';
    }
}
