package Recurrtion;
import java.util.*;
public class Power
{
    public static void main(String [] args)
    {
       Scanner sc= new Scanner(System.in);
        System.out.println("A");
        int a=sc.nextInt();
        System.out.println("B");
        int b= sc.nextInt();
        System.out.println(calculate(a,b));
    }
    public static int calculate(int a,int b)
    {
        if(b==1)
        {
            return a;
        }
        if(b%2==0)
        {
            return  calculate(a*a,b/2);
        }
        else
        return a*calculate(a,b-1);
    }
}
