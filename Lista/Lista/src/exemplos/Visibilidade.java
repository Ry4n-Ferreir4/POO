package exemplos;

public class Visibilidade {
    private int numeroPrivado;

    public Visibilidade(int numeroPrivado) {
        this.numeroPrivado = numeroPrivado;
    }

    public int getNumeroPrivado() {
        return numeroPrivado;
    }

    public void setNumeroPrivado(int novoNumeroPrivado) {
        this.numeroPrivado = novoNumeroPrivado;
    }

    public static void main(String[] args) {
        Visibilidade exemplo = new Visibilidade(42);

        int valorAtual = exemplo.getNumeroPrivado();
        System.out.println("Valor atual: " + valorAtual);

        exemplo.setNumeroPrivado(100);
        valorAtual = exemplo.getNumeroPrivado();
        System.out.println("Novo valor: " + valorAtual);
    }
}
