package hera;

public class Retangulo extends Forma {
 private double comprimento;
 private double largura;

 public Retangulo(double comprimento, double largura) {
     this.comprimento = comprimento;
     this.largura = largura;
     calcularArea();
 }

 private void calcularArea() {
     area = comprimento * largura;
 }
}
