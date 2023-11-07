package Escola;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentarPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
