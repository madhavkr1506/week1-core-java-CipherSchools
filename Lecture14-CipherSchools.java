// multiple inheritence, method overriding in interfaces
// implementing interfaces, extending interfaces
interface M{
    int x=10;
    void fun();
}
interface N{
    int x=20;
    void fun();
}
class C implements M,N {
        public void fun(){
            System.out.println(M.x);
            System.out.println(N.x);
            System.out.println(M.super.hashCode());
            System.out.println(N.super.hashCode());
        }
        
}
interface o extends M,N{
    void fun();
}
class D implements o{
    public void fun(){
        System.out.println("hello, Im fun in D");
    }
    
}
public class Lecture_14 {
           public static void main(String args[]){
               C c=new C();
               c.fun();
               D d=new D();
               d.fun();
           }
    
}
