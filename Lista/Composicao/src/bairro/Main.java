package bairro;

public class Main {
	public static void main(String[] args) {
       
        Endereco endereco = new Endereco("Jorge Dumar", "Fortaleza", "Ceara");

        
        Pessoa pessoa = new Pessoa("João", endereco);

        
        System.out.println("Nome da Pessoa: " + pessoa.getNome());
        System.out.println("Endereco da Pessoa: " + pessoa.getEndereco().getRua() + ", " +
                pessoa.getEndereco().getCidade() + ", " + pessoa.getEndereco().getEstado());
    }
}
