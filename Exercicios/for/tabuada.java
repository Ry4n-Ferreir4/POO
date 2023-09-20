import java.util.Scanner;
public class tabuada {
    public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite um numero e será apresentada a sua tabuada de multiplicação: ");
            int numero = entrada.nextInt();

            for(int i = 0; i<=10; i++){
                    int resultado = numero * i; 
                    System.out.println(numero + " * " + i + " = " + resultado);
            }



    }
}
