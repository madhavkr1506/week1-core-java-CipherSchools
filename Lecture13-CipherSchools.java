// abstract, interfaces, implementation 
// properties derivation. method overriding 

interface shape{
    double pi=3.14;//public,static,abstract
    double getsquare(double r);//public , abstract
}
class circle implements shape{
   public double getsquare(double r){
        return r*r;
    }
}
interface numbers{
   int x=10;
   void fun();
}
interface alphabets{
 int x=10;
void fun();
}
interface lost extends numbers{
   void print();
}
class ok implements lost{
    public void print(){
    }
    public void fun(){

    }
}
interface k extends numbers,alphabets{
      
}
class B1 implements numbers,alphabets{
    public void fun(){
        System.out.println("Im a method in multiple inheritence");
        System.out.println(alphabets.x+" "+numbers.x);
    }
}
class A{
    int make(int a){
        System.out.println("This  is parent");
        return 0;
    }
}
class B extends A{
    int make(int a){
        System.out.println("This is in child");
        return 0;
    }
    void print(){
        System.out.println("This is 2nd in child");
    }
}
public class Interfaces_13 {
    public static void main(String[] args) {
        circle a=new circle();
      System.out.println( a.getsquare(2.5)); 
      A a1=new B();
         a1.make(2);
        //  a1.print();
        B1 l=new B1();
        l.fun();
        
    }
}
