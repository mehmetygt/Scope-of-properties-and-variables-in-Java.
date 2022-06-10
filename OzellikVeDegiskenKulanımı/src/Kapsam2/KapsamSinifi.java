
package Kapsam2;


public class KapsamSinifi {
     private int sayi=30;

    public KapsamSinifi() {
        
    }
    public class DahiliSinif{
        
     private int sayi=20;  
     private int sayi2=5;
        
    public void onIleCarp1(){
    
    int sayi=10;
   
        for (int i = 1; i < 6; i++) {
            System.out.println(i+" * "+sayi+" sonuc: "+i*sayi);
        // burada java en lokal olana ulaşır o yüzden int sayı değişkeninde 10 u esas alır    
        }
    
    }
     public void onIleCarp2(){
    
    int sayi=10;
   
        for (int i = 1; i < 6; i++) {
            System.out.println(i+" * "+this.sayi+" sonuc: "+i*this.sayi);
        /*burada this.sayi dediğimiz için java classtaki private özeliği kastetiğimizi anlar 
          ama kendi clasını (inner clas) eas alırint sayı değişkeninde 20 yi esas alır   */
        }
    
    }
      public void onIleCarp3(){
    
    int sayi=10;
   
        for (int i = 1; i < 6; i++) {
            System.out.println(i+" * "+KapsamSinifi.this.sayi+" sonuc: "+i*KapsamSinifi.this.sayi);
        /*burada KapsamSinifi.this.sayi dediğimiz için java direkt verdiğimiz
            adrese gider (KapsamSinifi.this.sayi) kapsam sınıfındaki private sayı değişkenini 20 u esas alır   */
        }
    
    }
    }
        //KapsamSinifinın bir methodu olan bu method da inner clasın bir özelliğine doğrudan ulaşabilir
     public void onIleCarp4(){
    
  // tabi nesnesini oluşturmammız lazım
         DahiliSinif dadiliSinif=new DahiliSinif();
         
         System.out.println("dahili sınıfın private özelliği : "+dadiliSinif.sayi2);
    
    }
    
}
