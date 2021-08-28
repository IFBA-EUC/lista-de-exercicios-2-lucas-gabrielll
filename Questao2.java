package questao2;

import java.util.Scanner;

public class questao2 {
    
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            
            System.out.println("Digite as coordenadas do Ponto A: ");
            System.out.println("Xa: ");
            double Xa = leitor.nextDouble();
            System.out.println("Ya: ");
            double Ya = leitor.nextDouble();
            System.out.println("Za: ");
            double Za = leitor.nextDouble();
            System.out.println("Digite as coordenadas do Ponto B: ");
            System.out.println("Xb: ");
            double Xb = leitor.nextDouble();
            System.out.println("Yb: ");
            double Yb = leitor.nextDouble();
            System.out.println("Zb: ");
            double Zb = leitor.nextDouble();
            double d = Math.sqrt(Math.pow((Xb - Xa), 2) + Math.pow((Yb - Ya), 2) + Math.pow((Zb - Za), 2));   //raiz quadrada de ((Xb - Xa)**2 + (Yb - Ya)**2 + (Zb - Za)**2)
            System.out.printf("A distância entre os pontos é: %f", d);
        }
    }

}
