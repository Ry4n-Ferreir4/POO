import java.util.Scanner;
public class advinha_numero {
    public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            int numeroSecreto = 25;

            System.out.println("Estou pensando em um numero entre 1 e 100 qua lseria ele? ");
            int numeroAdvinha = entrada.nextInt();

            while(numeroAdvinha != numeroSecreto){
                System.out.println("Errou tente novamente: ");
                numeroAdvinha = entrada.nextInt();


            }
            System.out.println("Acertooou!!!!!");
    }
}
