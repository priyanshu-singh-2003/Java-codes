import java.lang.*;
import java.util.*;
public class Priyanshu{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter the value of n");
    n=sc.nextInt();
    int i = 1 ; 
    int fact = 1;
    while(i<=n){
      fact=fact*i;
      i++;
    }
    System.out.println("n!= "+fact);
 
  }
}