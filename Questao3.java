package questao3;

import java.util.Scanner; 

public class Questao3 {
 
    public static void main(String[] args) { 
        Scanner leitor = new Scanner(System.in); 
        
         
        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:"); 
       double x1 = leitor.nextFloat(); 
       double y1 = leitor.nextFloat(); 
       double x2 = leitor.nextFloat(); 
       double y2 = leitor.nextFloat(); 
        
        double dist = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 1/2); 
        System.out.println("A distância é: " + dist);
        
    } 

}
