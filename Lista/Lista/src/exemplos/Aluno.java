package exemplos;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public static void main(String[] args) {
        // Criando uma instância de Aluno
        Aluno aluno1 = new Aluno("Maria", 20);

        
        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Idade do aluno: " + aluno1.getIdade());

        
        aluno1.setNome("João");
        aluno1.setIdade(22);

        
        System.out.println("Novo nome do aluno: " + aluno1.getNome());
        System.out.println("Nova idade do aluno: " + aluno1.getIdade());
    }
}
