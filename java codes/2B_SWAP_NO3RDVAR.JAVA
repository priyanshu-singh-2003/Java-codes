import java.lang.*;
import java.util.*;
public class Priyanshu{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a , b;
    System.out.println("enter the value of a");
    a = sc.nextInt();
    System.out.println("enter the value of b");
    b = sc.nextInt();

    System.out.println("before swap Value of a = " +a);
    System.out.println("before swap Value of b = " +b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swap Value of a = " +a );
    System.out.println("after swap Value of b = " +b);
  }
}