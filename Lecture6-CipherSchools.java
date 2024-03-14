// char and char to int instantiation
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
    char ch = 'a';
    System.out.println(ch);
    int a = Character.getNumericValue('z');
    System.out.println("A is: "+ a);
    
    char c = 'a';
    int xa = c;
    System.out.println(xa);
    System.out.println((int)('a'));
    System.out.println((int)('A'));

    //we will require 'A' -> 0, 'Z', -> 25

    char c3 = 'e';
    int e = c3 - 'a';
    System.out.println("E is : " + e);
  }
}
