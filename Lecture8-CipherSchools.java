// control flows and objects
// class car{
//     String name;
//     String color;
//     int year;
//     int maxspeed;
//     void accelerate(){
//         System.out.println("car is accealerating");
//     }
// }
// public class Car_8{
//     public static void main(String[] args) {
//         car polo=new car();
//         System.out.println(polo.name="honda");
//         System.out.println(polo.color);
//         System.out.println(polo.year);
//         System.out.println(polo.year);
//         polo.name="supra";
//         polo.color="black";
//         polo.year=2019;
//         polo.maxspeed=420;
//         System.out.println(polo.name="honda");
//         System.out.println(polo.color);
//         System.out.println(polo.year);
//         System.out.println(polo.year);
//     }
// }

import java.util.Scanner;
class student{
    String name;
    int marks;
    boolean checkpass(){
        if(marks>=40){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Controlflow_8 {
    int max(int a ,int b,int c){
        if(a>b){
            if(a>c)
               return a;
        }
        else if(b>c){
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        student s1=new student();
        s1.name="sanjay";
        s1.marks=30;
        student s2=new student();
        s2.name="matta";
        s2.marks=90;
        System.out.println(s1.checkpass());
        System.out.println(s2.checkpass());
        Controlflow_8 c=new Controlflow_8();
       System.out.println( c.max(20, 10, 3));
       Scanner sc=new Scanner(System.in);
        s1.name=sc.nextLine();
        s1.marks=sc.nextInt();
        System.out.println(s1.checkpass());
        char l='a';
        switch(l){
            case 'a':
            System.out.println("hi im a");
            break;
            case 'b':
            System.out.println("hi im b");
            break;
             default:
             System.out.println("hi im default");
        }
    }
}

