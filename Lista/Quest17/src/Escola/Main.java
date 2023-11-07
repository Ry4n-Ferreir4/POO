package Escola;

public class Main {

    public static void main(String[] args) {
   
        Pessoa pessoa = new Pessoa("Maria", 25);
        System.out.println("Informações da Pessoa:");
        pessoa.apresentarPessoa();
        System.out.println();

        Aluno aluno = new Aluno("João", 20, "2023123456");
        System.out.println("Informações do Aluno:");
        aluno.apresentarAluno();
    }
}
