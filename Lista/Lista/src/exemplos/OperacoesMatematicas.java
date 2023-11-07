package exemplos;

public class OperacoesMatematicas {
    public static int somar(int a, int b) {
        return a + b;
    }

 
    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int resultadoSoma = OperacoesMatematicas.somar(5, 3);
        int resultadoSubtracao = OperacoesMatematicas.subtrair(10, 4);
        int resultadoMultiplicacao = OperacoesMatematicas.multiplicar(6, 2);
        double resultadoDivisao = OperacoesMatematicas.dividir(8, 2);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}
