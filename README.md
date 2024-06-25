# Desafio: Aprenda na Prática Programação Orientada a Objetos

## 📖 Descrição
Este repositório contém a implementação do desafio "Aprenda na Prática Programação Orientada a Objetos" oferecido pela Digital Innovation One. O objetivo do projeto é colocar em prática os principais conceitos da Programação Orientada a Objetos (POO) em Java: Abstração, Encapsulamento, Herança e Polimorfismo, através de um projeto que modela um sistema de Bootcamp.

```mermaid
classDiagram
    class Bootcamp {
        -String nome
        -String descricao
        -List~Conteudo~ conteudos
        +getNome(): String
        +setNome(String nome): void
        +getDescricao(): String
        +setDescricao(String descricao): void
        +getConteudos(): List~Conteudo~
        +setConteudos(List~Conteudo~ conteudos): void
    }

    class Conteudo {
        <<abstract>>
        -static double XP_PADRAO
        -String titulo
        -String descricao
        +calcularXp(): double
        +getTitulo(): String
        +setTitulo(String titulo): void
        +getDescricao(): String
        +setDescricao(String descricao): void
    }

    class Curso {
        -int cargaHoraria
        +calcularXp(): double
        +getCargaHoraria(): int
        +setCargaHoraria(int cargaHoraria): void
    }

    class Mentoria {
        -LocalDate data
        +calcularXp(): double
        +getData(): LocalDate
        +setData(LocalDate data): void
    }

    class Dev {
        -String nome
        -Set~Conteudo~ conteudosInscritos
        -Set~Conteudo~ conteudosConcluidos
        +inscreverBootcamp(Bootcamp bootcamp): void
        +progredir(): void
        +calcularTotalXp(): double
        +getNome(): String
        +setNome(String nome): void
        +getConteudosInscritos(): Set~Conteudo~
        +getConteudosConcluidos(): Set~Conteudo~
    }

    Bootcamp --> Conteudo : contains
    Conteudo <|-- Curso
    Conteudo <|-- Mentoria
    Dev --> Bootcamp : subscribes
    Dev --> Conteudo : progresses

```
