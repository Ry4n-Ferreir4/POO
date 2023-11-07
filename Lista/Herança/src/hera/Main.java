package hera;

public class Main {
 public static void main(String[] args) {
     Circulo circulo = new Circulo(5.0);
     Retangulo retangulo = new Retangulo(4.0, 6.0);

     System.out.println("Área do círculo: " + circulo.getArea());
     System.out.println("Área do retângulo: " + retangulo.getArea());
 }
}
