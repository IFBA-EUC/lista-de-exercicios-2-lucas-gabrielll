
package questao6;

import java.util.Scanner;
public class Questao6 {

    
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int nd, d = 10, r, c = 0;


        System.out.println("Digite um número: ");
        nd = leitor.nextInt();

        do{
            r = nd / d;
            c++;
            d = d * 10;
        }while(r >= 1);
        System.out.printf("Foram informados %d dígitos", c);
        leitor.close();
    }

}
