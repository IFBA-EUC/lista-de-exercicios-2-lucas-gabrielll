
package questao7;
import java.util.Scanner;
public class Questao7 {

    public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in); 
        int cod;  
        do { 
            System.out.print("Informe o código: "); 
            cod = leitor.nextInt();
            if(cod != -1){       
                System.out.println("Código: " + cod); 
            }
            
        } while (cod != -1);
     
       
    }

}
        
      
    
    

