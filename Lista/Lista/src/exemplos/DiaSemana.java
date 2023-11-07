package exemplos;

public class DiaSemana {
 
    public enum DiadaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
    }

    public static void main(String[] args) {
    
        DiadaSemana diaAtual = DiadaSemana.SEGUNDA;  


        System.out.println("Hoje é: " + diaAtual);
    }
}
