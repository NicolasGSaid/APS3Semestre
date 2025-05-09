
package com.mycompany.aps3semestre;

public class Especie {
    
    private String grupo;
    private String nomePopular;
    private String nomeCientifico;
    private String categoria;
    private String bioma;

    public Especie(String grupo, String nomePopular, String nomeCientifico, String categoria, String bioma) {
        this.grupo = grupo;
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.categoria = categoria;
        this.bioma = bioma;
    }

    public Especie() {
    }
    
    

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getBioma() {
        return bioma;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    
}


