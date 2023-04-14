package com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(){}
    
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
        this.conteudosInscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    public double calcularXP(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo :: calcularXP).sum();
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
