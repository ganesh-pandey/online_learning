package Recurrtion;

import java.util.Scanner;

public class Fibb
{
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner sc=new Scanner(System.in);
        System.out.println("N");
        int n=sc.nextInt();
        System.out.println(calculate(n));
    }
    public static int calculate(int n)
    {
        if(n==1||n==0)
        {
            return n;
        }
        return calculate(n-1)+calculate(n-2);
    }
}
