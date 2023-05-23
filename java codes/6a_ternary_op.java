import java.lang.*;
import java.util.*;
public class Priyanshu{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a , b,c;
    System.out.println("enter the value of a");
    a = sc.nextInt();
    System.out.println("enter the value of b");
    b = sc.nextInt();
    System.out.println("enter the value of b");
    c = sc.nextInt();
    max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    System.out.println("Maximum number among " + a + ", " + b + " and " + c + " is " + max);
  }
}
