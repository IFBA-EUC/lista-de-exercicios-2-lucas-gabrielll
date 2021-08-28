
package questao8;

import java.util.Scanner;
public class Questao8 {

    public static void main(String[] args) {
        
   
        Scanner leitor = new Scanner(System.in);
        
        int n, F0 = 0, F1 = 1, Fn = 0;
        System.out.printf("Digite um número não negativo: ");
        
        n = leitor.nextInt();
        
        if(n < 0){
            System.out.println("ERRO!");
        }else{
            System.out.printf("0 1 ");
            for(int i = 1; i < n; i++){
                
                Fn = F1 +  F0;
                System.out.printf("%d ", Fn);
                F0 = F1;
                F1 = Fn;
            }
        }
        

    }

}

        

