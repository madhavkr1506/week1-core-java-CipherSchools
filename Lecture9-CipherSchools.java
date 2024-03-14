// multiple inheritence
// classes and properties
class A{
    int a ,b;
    public void show(){
        System.out.println("hello");
    }
}
class B extends A{
    int c,d;
    public void write(){
        System.out.println("writing");
    }
}
class  C extends B{
int e,f;
public void speak(){
    System.out.println("speak");
}
}
class D extends C{
      int g,h;
      public void eat(){
        System.out.println("eating");
      }
}
class E extends C{
    int i,j;
    public void cry(){
        System.out.println("Crying");
    }
}
 interface A1{
    public void doing();
}
interface B1 {
    public void done();
}
class C1 implements A1,B1{
    public void done(){

    }
    public void doing(){

    }
}
class C2 extends A implements A1{
    public void doing(){

    }
}
public class Inheritence {
    public static void main(String[] args) {
        //single level
        B b=new B();
        b.show();
        //multilvel
        D d=new D();
        d.show();
        //heirarical
        E e=new E();
        e.speak();
       //Multiple inheritence is not possible;
    }
}
