import java.util.*;
public class firstNatural {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter value of n :");
         int n=sc.nextInt();
         System.out.println("Natural numbers from 0 to "+n+" :");
         for (int i=1;i<=n;i++)
         {
            System.out.println(i);
         }
    }
}
