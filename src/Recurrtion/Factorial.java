package Recurrtion;
import java.util.*;
public class Factorial
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Calculate(n));
    }
    public static int Calculate(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        int c=Calculate(n-1);
        return n*c;
    }
}
