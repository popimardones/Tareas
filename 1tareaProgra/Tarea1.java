
class PiramideMario {
  int randomAltura(){   
       return java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 21);
  }
}

public class Tarea1{
    
    public static void main(String[] args){
  
    PiramideMario p = new PiramideMario();
    int altura = p.randomAltura();
    System.out.println("Imprimiendo pirámide de altura " + altura );
   
    for(int i=0; i<altura; i++) {
        for(int j=0; j<altura-i-1; j++) {
            System.out.print(" ");
        }
        for(int j=0; j<i+1; j++) {
            System.out.print("#");
        }
            System.out.println();
    }
  }
  

}