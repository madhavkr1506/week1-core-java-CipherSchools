// final keyword and it's properties

class A{
    final int a=10;
    final int b;
    A(){
        b=9;  
    }
    final void show(){
        System.out.println("Hi Ima final function and cannot be overriden");
    }
}
final class B extends A{
    //child class cannot overirde final methods ;
      
}
// class C extends B{
//     final classes cannot be inherited
// }

public class Final_11 {
    public static void main(String[] args) {
        
    }
}
