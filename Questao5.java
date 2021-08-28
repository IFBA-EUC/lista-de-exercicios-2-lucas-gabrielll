
package questao5;


public class Questao5 {

    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println("\n \n");
            System.out.println("\n");
            System.out.println("Tabuada do " + i + ": \n");
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

}