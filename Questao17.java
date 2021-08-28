package questão17;

import java.util.Scanner;
public class Questão17 {

  

    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            
            System.out.print("Digite um número decimal de até 3 digitos: ");
           int num = leitor.nextInt();
            int a1 = num/100;     
            int r1 = num % 100;
            int a2 = r1 / 10;   
            int a3 = r1 % 10;   
            
            int num1 = a1 * 100; 
            int num2 = a2 * 10;   
            int num3 = a3;        
           
            
            String [] cent;         
            cent = new String[9];   
            cent[0] = "C";      
            cent[1] = "CC";    
            cent[2] = "CCC";    
            cent[3] = "CD";     
            cent[4] = "C";      
            cent[5] = "DC";    
            cent[6] = "DCC";   
            cent[7] = "DCCC";  
            cent[8] = "CM";     
            
            
            String [] dez;
            dez = new String[9];
            dez[0] = "X";       
            dez[1] = "XX";      
            dez[2] = "XXX";     
            dez[3] = "XL";      
            dez[4] = "L";       
            dez[5] = "LX";      
            dez[6] = "LXX"; 
            dez[7] = "LXXX";   
            dez[8] = "XC";      
            
            
            String [] uni;
            uni = new String[9];
            uni[0] = "I";       
            uni[1] = "II";      
            uni[2] = "III";     
            uni[3] = "IV";      
            uni[4] = "V";      
            uni[5] = "VI";      
            uni[6] = "VII";     
            uni[7] = "VIII";   
            uni[8] = "IX";      
           
            String cr = " ";     
            switch (num1) {
                case 100:        
                    cr = cent[0];
                    break;
                case 200:
                    cr = cent[1];
                    break;
                case 300:
                    cr = cent[2];
                    break;
                case 400:
                    cr = cent[3];
                    break;
                case 500:
                    cr = cent[4];
                    break;
                case 600:
                    cr = cent[5];
                    break;
                case 700:
                    cr = cent[6];
                    break;
                case 800:
                    cr = cent[7];
                    break;
                case 900:
                    cr = cent[8];
                    break;
            }   String dr = " ";     
            switch (num2) {
                case 10:
                    dr = dez[0];
                    break;
                case 20:
                    dr = dez[1];
                    break;
                case 30:
                    dr = dez[2];
                    break;
                case 40:
                    dr = dez[3];
                    break;
                case 50:
                    dr = dez[4];
                    break;
                case 60:
                    dr = dez[5];
                    break;
                case 70:
                    dr = dez[6];
                    break;
                case 80:
                    dr = dez[7];
                    break;
                case 90:
                    dr = dez[8];
                    break;
            }   String ur = " ";     
            switch (num3) {
                case 1:
                    ur = uni[0];
                    break;
                case 2:
                    ur = uni[1];
                    break;
                case 3:
                    ur = uni[2];
                    break;
                case 4:
                    ur = uni[3];
                    break;
                case 5:
                    ur = uni[4];
                    break;
                case 6:
                    ur = uni[5];
                    break;
                case 7:
                    ur = uni[6];
                    break;
                case 8:
                    ur = uni[7];
                    break;
                case 9:
                    ur = uni[8];
                    break;
            }   if (num < 10) {
                System.out.println(ur);
            } else if(num < 100 && num > 9){
                System.out.println( dr + ur);
            }else{
                System.out.println(cr + dr + ur);
            }
           
        }
    }
}

