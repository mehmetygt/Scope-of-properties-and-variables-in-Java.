
package Kapsam2;


public class Main {
    public static void main(String[] args) {
        
         KapsamSinifi.DahiliSinif dahili=new KapsamSinifi().new DahiliSinif();
         dahili.onIleCarp1();
         System.out.println("********");
         dahili.onIleCarp2();
         System.out.println("********");
         dahili.onIleCarp3();
         System.out.println("********");
         
        KapsamSinifi kapsam=new KapsamSinifi();
        kapsam.onIleCarp4();
    }
   
    
}
