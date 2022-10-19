package com.eleicao;

public class Candidato {
    private String nome;
    private String partido;
    private String sigla;
    private int numPartido;
    private int qtdVotos = 0;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPartido(){
        return this.partido;
    }
    public void setPartido(String partido){
        this.partido = partido;
    }

    public String getSigla(){
        return this.sigla;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }

    public int getNumPartido(){
        return this.numPartido;
    }
    public void setNumPartido(int numPartido){
        this.numPartido = numPartido;
    }

    public void somaVotos(){
        this.qtdVotos +=1;
    }

    public String msg(){
        String msg = "Candidato: " + this.nome + "\nSigla Partido: " + this.sigla;

        return msg + "\nTotal votos:" + this.qtdVotos;
    }
}
