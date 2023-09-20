import java.util.Scanner;

public class preco {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double precoUnitario = entrada.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = entrada.nextInt();

        double precoTotal;

        if (quantidade > 10) {
            double desconto = 0.10 * precoUnitario;
            precoTotal = precoUnitario * quantidade - desconto;
        } else {
            precoTotal = precoUnitario * quantidade;
        }

        System.out.println("O preço total é: R$" + precoTotal);












    }
}
