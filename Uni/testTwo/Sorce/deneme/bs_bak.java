package Uni.testTwo.Sorce.deneme;

public class bs_bak {
    private int private_a = 40;
    public int a = 10;
    int degisken;

    protected void protected_deneme(){
        System.out.println("Protected erisim");

    }
    private void private_deneme(){
        System.out.println("Deneme sinif - private metodu");
        System.out.println("private_a :" + private_a);
        System.out.println("a:" + a);
    }

    public void public_deneme(){
        System.out.println("Deneme sinif - private metodu");
        System.out.println("a:"+ a);
    }
    public static void main(String[] args){
        
    }
}
