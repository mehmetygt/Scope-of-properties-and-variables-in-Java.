
package Kapsam1;

public class KapsamSinifi {
    private int sayi=30;

    public KapsamSinifi() {
        
    }
    public void onIleCarp1(){
    
    int sayi=10;
   
        for (int i = 1; i < 6; i++) {
            System.out.println(i+" * "+sayi+" sonuc: "+i*sayi);
        // burada java en lokal olana ulaşır o yüzden int sayı değişkeninde 110 u esasalır    
        }
    
    }
    public void onIleCarp2(){
    
    int sayi=10;
   
        for (int i = 1; i < 6; i++) {
            System.out.println(i+" * "+this.sayi+" sonuc: "+i*this.sayi);
        // burada this.sayi dediğimiz için java classtaki private özeliği kastetiğimizi anlar int sayı değişkeninde 30 u esasalır    
        }
    
    }
    public void onIleCarp3(){
    
   // int sayi=10;
   
         for (int i = 1; i < 6; i++) {
            System.out.println(i+" * "+sayi+" sonuc: "+i*sayi);
        // burada java en lokal olana ulaşır ama bulamadığından bir üste geçer o yüzden int sayı değişkeninde 30 u esasalır    
        }
    
    }
}
