
package questao15;

public class Questao15 {
      private float media;


  public void media(double n1, double n2, double n3){
        float med;
        med = (float) ((n1 + n2 + n3) / 3);
        System.out.println("A media do aluno é: " + med);
        this.media = med;
    }


    public void status(){
        if(this.media > 6){
            System.out.println("Aprovado");
        }else if(this.media >= 4 && this.media <= 6){
            System.out.println("Verificação Suplementar");
        }else{
            System.out.println("Reprovado");
        }
    }
}  

    
  

 