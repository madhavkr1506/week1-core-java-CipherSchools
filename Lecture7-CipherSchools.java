// primitive data types
public class primitiveDT{
  public static void main(String[] args){
    int x = 5;
    int y = 7;
    System.out.println("X is "+ x);
    System.out.println("Y is "+ y);

    byte b = 10;
    System.out.println("B is "+ b);
    byte b2 = (byte)129;
    System.out.println("B is "+ b2);
    byte b3 = (byte)128;
    System.out.println("B is "+ b3);
    byte b3 = (byte)256;
    System.out.println("B is "+ b3);

    // int i = b;
    // System.out.println("I is "+ i);
    char c = 'a';
    int xa = c;
    System.out.println(xa);
    System.out.println((int)('a'));
    System.out.println((int)('A'));

    //we will require 'A' -> 0, 'Z', -> 25

    char c3 = 'e';
    int e = c3 - 'a';
    System.out.println("E is : " + e);
    int z = x + y;
    // increment and decrement operators

    int m = 5;
    int n = m++;
    System.out.println("M is : ");
    System.out.println(m);
    System.out.println("N is : ");
    System.out.println(n);

    int p = 5;
    int q = p++;
    System.out.println("P is : " + p+", Q is: "+ q);
    n=m--;
    System.out.println("M is : "+m + ", N is: "+ n);
    m = 5;
    n=--m;
    System.out.println("M is : "+m + ", N is: "+ n);

    // We want to create an object out of variable x

    Integer x1 = new Integer(x);
    System.out.println(x1);
  }
    
    
}
