Q1. creat the program in java languae swap value with threed varibal


 import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner(System.in);
        int a,b,c;
        a=inputdo.nextInt();
        b=inputdo.nextInt();
        System.out.println("the real value of a" + a );
        System.out.println("the real value of b "+ b);
        
        c=a;
        a=b;
        b=c;
        System.out.println("Swap value of a:" + a);
        System.out.println("swap value of b :"+ b);
        
        
    }
}


Q2.creat the program in java language swap value without threed varible


import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner(System.in);
        int swap1,swap2;
        swap1=inputdo.nextInt();
        swap2=inputdo.nextInt();
        System.out.println("real value of a :" +swap1);
        System.out.println("real value of b :" +swap2);
        swap1=swap1+swap2;
        swap2=swap1-swap2;
        swap1=swap1-swap2;
        System.out.println("swap value of swap1 :" + swap1);
        System.out.println("swap va;ue of swap2 :"+ swap2);
    }
}


