package exemplos;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Fiat", "Uno", 2019);

 
        String marca = meuCarro.getMarca();
        String modelo = meuCarro.getModelo();
        int ano = meuCarro.getAno();

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
