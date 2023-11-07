package bairro;

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;

    public Endereco(String rua, String cidade, String estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

   
    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
