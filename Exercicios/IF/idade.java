import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idadeUsuario = entrada.nextInt();

        if(idadeUsuario < 18){
            System.out.println("Você tem menos de 18 anos e ainda precisa da assinatura dos pais!");
        }else{
            System.out.println("Você tem mais de 18 e já pode assinar sozinho");
        }
    }
}
