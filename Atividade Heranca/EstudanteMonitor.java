public class EstudanteMonitor extends Estudante {
    private double bolsa;
    private String disciplina;

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getBolsa() {
        return bolsa;
    }   

    public String getDisciplina() {
        return disciplina;
    }

    public EstudanteMonitor(int matricula, String nome, char sexo, double bolsa, String disciplina) {
        setMatricula(matricula);
        setNome(nome);
        setSexo(sexo);
        this.bolsa = bolsa;
        this.disciplina = disciplina;
    };

    public void tirarDuvidas(){
        System.out.println("Tirando duvidas...!");
    }
    public void auxiliaProfessor(){
        System.out.println("Auxiliando professor...!");
    }
    @Override
    public void Exibir() {
        super.Exibir();
        System.out.println("Bolsa: "+bolsa);
        System.out.println("Disciplina: "+disciplina);
    }
    @Override
    public void atribuirNota(int numProva, double nota) {
        notas[numProva-1]=nota;
        if(nota<=7.0){
            System.out.println("Monitor desligado! ");
        }
    }
}