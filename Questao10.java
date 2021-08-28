
package questao10;


import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String r = "";
        float inv;
        double Ms = 0, sal = 0;
        int jur;


        System.out.print("Valor a ser investido: ");
        inv = leitor.nextFloat();
        System.out.print("Taxa de juros mensal: ");
        jur = leitor.nextInt();
        sal = inv;

        do{
            for(int a = 1; a <= 12; a++){
                sal = sal + ((sal * jur) / 100);
                Ms = Ms + sal;
            }
            System.out.println("Saldo do investimento após 1 ano: " + Ms);
            System.out.println("Deseja processar mais um ano? (S/N)");
            r = leitor.next();
            sal = Ms;
        }while((r.equals("S")) || (r.equals("s")));
        
    }
}
