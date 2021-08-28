
package questao16;


public class Questao16 {
    
    private int hor;
    private int min;
    private int seg;

    public void Tempo(int seg){
        this.hor = seg / 3600;
        int r = seg % 3600;
        this.min = r / 60;
        r = r % 60;
        this.seg = r;
    }
    public int Horas(){
        return this.hor;
    } 
    public int Minutos(){
        return this.min;
    }
    public int Segundos(){
        return this.seg;
    }
    public void status(){
        System.out.println("Horas: " +Horas());
        System.out.println("Minutos: " +Minutos());
        System.out.println("Segundos: " +Segundos());
    }

   
    }



  

 