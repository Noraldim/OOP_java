package Uni.testTwo;
import java.util.*;

public class week6 {
    String name;
    int age;
    int clas;
    boolean grad;

    public week6(){};
    week6(String adi, int yas, int sinif , boolean mz ){
        name = adi;
        age = yas;
        clas = sinif;
        grad = mz;
    }
    public static void main(String[] args){
        week6 o1 = new week6();
        int num = 3;
        week6[] record = new week6[num];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name :");
        o1.name = scan.next();
        System.out.println("Enter your age :");
        o1.age = scan.nextInt();
        System.out.println("Enter your class :");
        o1.clas = scan.nextInt();
        System.out.println("Are you graduate studant :");
        o1.grad = scan.nextBoolean();

        record[0] = o1;

    }

    
}
