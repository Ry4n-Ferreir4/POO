package bairro;

public class Pessoa {
	 	private String nome;
	    private Endereco endereco;

	    public Pessoa(String nome, Endereco endereco) {
	        this.nome = nome;
	        this.endereco = endereco;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public Endereco getEndereco() {
	        return endereco;
	    }
}
