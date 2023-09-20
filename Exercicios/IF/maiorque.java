import java.util.Scanner;

public class maiorque {
    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 numeros para eu verificar qual é o maior: ");
        System.out.println("Numero 1: ");
        int num1 = entrada.nextInt();
        System.out.println("Numero 2: ");
        int num2 = entrada.nextInt();
        System.out.println("Numero 3: ");
        int num3 = entrada.nextInt();

        if(num1 == num2 || num2 == num3){
            System.out.println("Os numeros são iguais!");
        }else if(num1 > num2 && num1 > num3){
            System.out.println("O numero "+ num1 + " é o maior");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("O numero "+ num2 + " é o maior");
        }else if(num3 > num1 && num3 > num2){
            System.out.println("O numero "+ num3 + " é o maior");
        }else{
            System.out.println("Digite numeros válidos!!!!");
        }
    }
}
