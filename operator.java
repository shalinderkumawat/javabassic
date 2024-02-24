Q1. creat the java program to ternary operator

  import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Enter the vlaue of divide value 0");
        int a=inputdo.nextInt();
        int s=inputdo.nextInt();
        String divide=(a%s==0)?"this number is divide by number 1":"this number is not divide by number ";
        System.out.println(divide);
    }
}


Q2. creat the program odd number or even number;

          import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        int a=inputdo.nextInt();
       // int s=inputdo.nextInt();
        String j=(a%2==0)?"even":"odd";
        System.out.println(j);
    }
}


Q3. creat the program gender chake;

    import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        char s=inputdo.next().charAt(0);
        String value=(s=='m'||s=='M')?"male":"female";
        System.out.println("Gender " + value);
    }
}



