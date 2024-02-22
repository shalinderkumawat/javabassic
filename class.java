Q1. creat the java programm 
    in this programm 
    => creat for class like add, divide , subtraction ,multiply, modluer
    inside main programm 
    => creat the all class object 


    import java.util.*;
class Add
{
    void add()
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Enter the value of a :");
        int a=inputdo.nextInt();
        System.out.println("Enter the value of b :");
        int b=inputdo.nextInt();
        System.out.println(a + " + " + b + " = " +(a+b));
    }




}

class Multiply
{
    void multiply()
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Enter the value of a :");
        int a=inputdo.nextInt();
        System.out.println("Enter the value of b :");
        int b=inputdo.nextInt();
        System.out.println(a +" *" + b + " = " +(a*b));
    }
}

class Divide
{
    void divide()
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Enter the value of a : ");
        int a=inputdo.nextInt();

        System.out.println("Eneter the value of b :");
        int b=inputdo.nextInt();
        System.out.println(a + " / " + b + "="+ (a/b));
    }
}

class Subtraction
{

    void subtraction()
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Enter the value of a :");
        int a=inputdo.nextInt();
        System.out.println("Enter the value of v :");
        int b=inputdo.nextInt();
        System.out.println(a +" - " +  b + " = " + (a-b));
    }
}

class Modluer
{
    void modluer()
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Eneter the modluer number of a : ");
        int a=inputdo.nextInt();
        System.out.println("Eneter the modluer of number of b :");
        int b=inputdo.nextInt();
        System.out.println(a + " % " + b +"=" + (a%b));
    }
}
public class Main{
    public static void main(String[] args)
    {
        Add ref=new Add();
        ref.add();



        Multiply refa=new Multiply();
        refa.multiply();

       Divide refe=new Divide();
       refe.divide();

       Subtraction refer=new  Subtraction();
       refer.subtraction();


       Modluer refera=new Modluer();
       refera.modluer();

    }
}

