package Estudante;

import Curso.Curso;
import Disciplina.Disciplina;

public class Estudante {

    private int matricula;
    private String nome;
    private char sexo;
    private double[] notas = new double[4];
    private static int numEstudante = 0;
    public static String descricao = "Essa classe representa os estudantes";
    Curso meuCurso;
    Disciplina[] materia = new Disciplina[5];

    public Estudante(String nom, char sex, int matri) {
        numEstudante++;
        this.matricula = matri;
        this.nome = nom;
        this.sexo = sex;
    }

    public Estudante(String nome, char sexo) {
        numEstudante++;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Estudante() {
        numEstudante++;
    }

    public static int getNumEstudante() {
        return numEstudante;
    }

    public void Exibir() {
        System.out.println("Matricula do aluno(a)= " + this.matricula);
        System.out.println("Nome do aluno(a)= " + this.nome);
        System.out.println("Sexo do aluno(a)= " + this.sexo);
        double soma = 0;
        // NOVO FORMATO DE FAZER FOR
        for (double teste : notas) {
            soma += teste;
            System.out.println("Todas as notas do aluno(a)=" + teste);
        }
        double media = soma / notas.length;
        System.out.println("A media do aluno(a) é= " + media);
        if (meuCurso != null) {
            meuCurso.exibir();
        }
    }

    public void Exibir(String titulo) {
        System.out.println(titulo);
        this.Exibir();
    }

    public void setNota(int numProva, double nota) {
        if (nota >= 1 && nota <= 10) {
            this.notas[numProva - 1] = nota;
        } else {
            System.out.println("Nota inválida");
        }
    }

    public double setNota(int indice) {
        return this.notas[indice - 1] = 0.0;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        }
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' && sexo == 'F') {
            this.sexo = sexo;
        }
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            System.out.println("Nenhum nome foi informado.");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getNota(int numProva) {
        return this.notas[numProva - 1];
    }

    public Curso getMeuCurso() {
        return meuCurso;
    }

    public void setMeuCurso(Curso curso) {
        meuCurso = curso;
    }

    public Disciplina[] getMateria() {
        return materia;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setMateria(Disciplina[] materia) {
        this.materia = materia;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
