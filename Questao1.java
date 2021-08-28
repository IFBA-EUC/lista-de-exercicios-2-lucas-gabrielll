package questao1;

import java.util.Scanner;

public class Questao01 {

   
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        

        System.out.println("Digite o valor de a: ");
        double a = leitor.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = leitor.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = leitor.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if(delta < 0){
            System.out.println("A equação não tem raízes.");
        }else if(delta == 0){
            double x1 = (-b) / (2*a);
            System.out.println("A única raiz da equação é: " + x1);
        }else{
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("As raizes da equação serão: " + x1 + " e " +x2);
           
        }
    }
}


    


