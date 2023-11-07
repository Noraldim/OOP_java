package Uni;


import java.util.*;
public class work {
    
    
    public static void main(String[] args){
        ogranci[] record = new ogranci[3];

        Scanner scan = new Scanner(System.in);
        ogranci o1 = new ogranci();
        System.out.print("enter the name :");
        o1.isim = scan.nextLine();
        System.out.print("enter the class :");
        o1.sinif = scan.nextInt();
       System.out.print("enter the age :");
        o1.yas = scan.nextInt();
        System.out.print("are you graduate :");
        o1.myzunMu = scan.nextBoolean();
        record[0] = o1;
        scan.nextLine();


        for(int i = 1 ; i < 3; i++){
            System.out.println("Now we will start the record form "+ i +" so Enter all it need ");
            String name = scan.nextLine();
            int clas = scan.nextInt();
            int age = scan.nextInt();
            boolean myzunMu = scan.nextBoolean();
            record[i] = new ogranci(name, clas,age,myzunMu);
            scan.nextLine();
            }
        for(int x = 0 ; x < 3 ; x++){
            System.out.println("Student " + x + ": Name: " + record[x].isim +
                    ", Class: " + record[x].sinif + ", Age: " + record[x].yas +
                    ", Graduate state: " + record[x].myzunMu);        }
    }
}
