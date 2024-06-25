package com.dio.bootcamp;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHorario(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEzequiel = new Dev();
        devEzequiel.setNome("Ezequiel");
        devEzequiel.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ezequiel:" + devEzequiel.getConteudosInscritos());
        devEzequiel.progredir();
        devEzequiel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ezequiel:" + devEzequiel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ezequiel:" + devEzequiel.getConteudosConcluidos());
        System.out.println("XP:" + devEzequiel.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}