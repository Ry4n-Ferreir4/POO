import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números da sequência de Fibonacci desejados: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("Por favor, digite um número positivo maior que zero.");
        } else {
            int primeiro = 0;
            int segundo = 1;
            int contador = 0;

            System.out.println("Os primeiros " + quantidade + " números da sequência de Fibonacci são:");

            while (contador < quantidade) {
                System.out.print(primeiro + " ");

                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;

                contador++;
            }
        }
		
    }
}
