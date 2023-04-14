package com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos(){
        return conteudosInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscrito){
        this.conteudosInscritos = conteudoInscrito;
    }

    public Set<Conteudo> getConteudosConcluidos(){
        return conteudosConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluido){
        this.conteudosConcluidos = conteudoConcluido;
    }

    public void inscreverBootCamp(Bootcamp bootCamp){

    }

    public void progredir(){

    }

    public void calcularXP(){

    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosInscritos, dev.conteudosInscritos);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
