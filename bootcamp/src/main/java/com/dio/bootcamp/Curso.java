package com.dio.bootcamp;

public class Curso extends Conteudo{

    private int cargaHorario;
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorario;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }
}
