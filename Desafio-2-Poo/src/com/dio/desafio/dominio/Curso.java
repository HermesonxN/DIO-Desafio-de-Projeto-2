package com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(){}

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP(){
        return XP_Padrao * cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" + "Titulo = " + getTitulo() + ", Descrição = " + getDescricao() + ", Carga horaria = " + cargaHoraria + "}";
    }
}
