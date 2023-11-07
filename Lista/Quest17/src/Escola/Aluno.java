package Escola;

class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void apresentarAluno() {
        apresentarPessoa(); // Chama o método da classe pai para imprimir informações da pessoa
        System.out.println("Matrícula: " + matricula);
    }
}
