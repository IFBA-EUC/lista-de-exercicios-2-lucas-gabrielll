
package questao4;

import java.util.Scanner;

public class Questao4 {
    
 
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        

        System.out.printf("Nome: ");
        String n = leitor.nextLine();
        System.out.printf("Preço: ");
        double prc = leitor.nextFloat();
        System.out.println("Quantidade: ");
        double qtd = leitor.nextInt();

        if(qtd <= 10){
           double val = prc * qtd;
            System.out.println("Nome: " + n + "\nValor: R$: " + val);
        }else if(qtd > 10 && qtd <= 20){
           double val = (prc * qtd) * 0.9;
            System.out.println("Nome: " + n + "\nValor: R$: " + val);
        }else if(qtd > 20 && qtd <= 50){
           double val = (prc * qtd) * 0.8;
            System.out.println("Nome: " + n + "\nValor: R$: " + val);
        }else{
          double val = (prc * qtd) * 0.75;
            System.out.println("Nome: " + n + "\nValor: R$: " + val);
        }
       

    }

}
