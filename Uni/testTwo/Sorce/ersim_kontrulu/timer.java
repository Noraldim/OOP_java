package Uni.testTwo.Sorce.ersim_kontrulu;
import Uni.testTwo.denmen;
import Uni.testTwo.Sorce.deneme.bs_bak;

public class timer {
    private  int privae_degisken = 10;
    public int public_degisken;
    protected int x = 24;
    int y = 12;
    
    public void set_private_degisken(int deger){
        privae_degisken = deger;
    }
    public int get_private_degisken(){
        return privae_degisken;
    }
    protected void protected_metot(){
        System.out.println("Siniftan ve ayni paketten erisim");

    }
    private  void private_metot(){
        System.out.println("sadece siniftan erisim");
    }
    public void public_metot(){
        System.out.println("disardan erisim mumkun");
    }
    public void private_age_erisim(int x){
        privae_degisken = x;
        System.out.println("private deasken " + privae_degisken);
        private_metot();
    }
    public static void main(String[] args){
        timer nesne = new timer();
        nesne.public_degisken = 4;
        nesne.public_metot();
        nesne.set_private_degisken(40);
        System.out.println("nesenenin private degisken degeri = " + nesne.get_private_degisken());
        nesne.private_age_erisim(10);
        nesne.protected_metot();
        System.out.println(nesne.public_degisken);
        System.out.println(nesne.y);
        System.out.println(nesne.x);

        bs_bak bS = new bs_bak();
        bS.


    }
}
