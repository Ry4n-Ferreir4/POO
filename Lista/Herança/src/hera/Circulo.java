package hera;


public class Circulo extends Forma {
 private double raio;

 public Circulo(double raio) {
     this.raio = raio;
     calcularArea();
 }

 private void calcularArea() {
     area = Math.PI * raio * raio;
 }
}
