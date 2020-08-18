public class Estudante {
    public Estudante(String nom, char sex, int matri) {
        this.matricula = matri;
        this.nome = nom;
        this.sexo = sex;
    }

    public Estudante(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Estudante() {
    }

    int matricula;
    String nome;
    char sexo;
    double[] notas = new double[4];

    void exibir() {
        System.out.println("Matricula do aluno(a)= " + this.matricula);
        System.out.println("Nome do aluno(a)= " + this.nome);
        System.out.println("Sexo do aluno(a)= " + this.sexo);
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            System.out.println("Todas as notas do aluno(a)=" + this.notas[i]);
        }
        double media = soma / notas.length;
        System.out.println("A média do aluno é= " + media);
    }

    void exibir(String titulo) {
        System.out.println(titulo);
        System.out.println("Matricula do aluno(a)= " + this.matricula);
        System.out.println("Nome do aluno(a)= " + this.nome);
        System.out.println("Sexo do aluno(a)= " + this.sexo);
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            System.out.println("Todas as notas do aluno(a)=" + this.notas[i]);
        }
        double media = soma / notas.length;
        System.out.println("A média do aluno é= " + media);
    }

    void atribuirNota(int numProva, double nota) {
        this.notas[numProva - 1] = nota;

    }

    void atribuirNota(int indice) {
        this.notas[indice] = 0.0;
    }

    double lerNota(int numProva) {
        return this.notas[numProva - 1];
    }
}