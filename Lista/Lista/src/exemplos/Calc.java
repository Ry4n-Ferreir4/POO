package exemplos;

public class Calc {
    // Soma para inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Soma para números de ponto flutuante (double)
    public double somar(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calc calculadora = new Calc();

        int somaInt = calculadora.somar(5, 3);
        double somaDouble = calculadora.somar(5.5, 3.2);

        System.out.println("Soma de inteiros: " + somaInt);
        System.out.println("Soma de double: " + somaDouble);
    }
}
