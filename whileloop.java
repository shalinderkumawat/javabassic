 Q1 1---->5 number print 

public class Main{
    public static void main(String[] args)
    {
        int number=1;
        while(number<=5)
        {
            System.out.println(number++);
        }
    }
}


 Q2 1---->10 number print

 	public class Main
{
    public static void main(String[] args)
    {
        int number=1;
        while(number<=10)
        {
            System.out.println(number++);
        }
    }
}

Q3 1--->100 number print 


public class Main
{
    public static void main(String[] args)
    {
        int number=1;
        while(number<=100)
        {
            System.out.println(number++);
        }
    }
}

Q4 50----->500 number print 
public class Main{
    public static void main(String[] args)
    {
        int number=50;
        while(number<=500)
        {
            System.out.println(number++);
        }
    }
}

Q5  12--->89 number print 

 public class Main{
    public static void main(String[] args)
    
    {
        int number=12;
        while (number<=89)
        {
            System.out.println(number++);
        }
    }
}

Q6  5--->1

public class Main{
    public static void main(String[] args)
    {
        int number=5;
        while (number>=1)
        {

        System.out.println(number--);
        }
    }
}

Q7  10----1

public class Main
{
    public static void main(String[] args)
    {
        int number=10;
        while(number>=1)
        {
            System.out.println(number--);
        }
    }
}

Q8 100--->1


public class Main{
    public static void main(String[] args)
    {
        int number=100;
        while (number>=1)
        {
            System.out.println(number--);
        }
    }
}

Q9 50---->1


public class Main{
    public static void main(String[] args)
    {
        int  number=50;
        while(number>=1)
        {
            System.out.println(number--);
        }
    }
}

Q10 89---23

public class Main{
    public static void main(String[] args)
    {
        int number=89;
        while (number>=23)
        {
            System.out.println(number--);
        }
    }
}



Q11 

a :
	1--->10 value print 

b:
	10---->1 value print 

c:
	23----->78 value print 


d :
	89--->78 value print 

g :
	to check a gender 
	m :male 
	f :female 
	not match 

v :check voter id 

e :vowel and consonant check 

s :swap number 
	w :with third variable 
	o :without third variable 




	import java.util.*;
public class Main{
    public static void main(String[] args)

    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the character a, ");
        char value=inputdo.next().charAt(0);
        if(value=='a')
        {
            System.out.println("the counting is 1 to 10 :");
            int number=1;
            while(number<=10)
            {
                System.out.println(number++);
            }
        }
        else if(value=='b')
        {
            System.out.print("the counting 10 to 1 :");
            int number=10;
            while(number>=1)
            {
                System.out.println(number--);
            }
        }
        else if (value=='c')
        {
            System.out.println("the counting 23 to 78:");
            int number=23;
            while(number<=78)
            {
                System.out.println(number++);
            }
        }
        else if(value=='d')
        {
            System.out.println("the counting 89 to 79 :");
            int number=89;
            while(number>=79)
            {
                System.out.println(number--);
            }
        }
        else if(value=='g')
        {
            System.out.print("enter your gender frist latter : ");
            char gender=inputdo.next().charAt(0);
            if(gender=='m')
            {
                System.out.println("male");
            }
            else if(gender=='f')
            {
                System.out.println("female");

            }
            else
            {
                System.out.println("sorry not match");

            }
        }
        else if  (value=='v')
        {
            System.out.println("enter your age:");
            int age=inputdo.nextInt();
            if(age<=18)
            {
                System.out.println("you are not eliglibil for voting");
            }
            else{
                System.out.println("you are eliglibil for voting ");
            }
        }
        else if(value=='e')
        {
            System.out.println("enter the aney character : ");
            char ja=inputdo.next().charAt(0);
            if(ja=='a'||ja=='e'||ja=='i'||ja=='o'||ja=='u')
            {

                System.out.println("this is vowal");
            }
            else
            {
                System.out.println("this character is consont ");
            }
        }
        else if(value=='s')
        {
            System.out.println("enter your dimind like with varible and without varible");
            char varible=inputdo.next().charAt(0);
            System.out.println("enter a and b :");
            if(varible=='n')
            {
                int number,number1;
                number=inputdo.nextInt();
                number1=inputdo.nextInt();
                System.out.println("real value of number :" + number);
                System.out.println("real value of number1 :" + number1);
                number=number+number1;
                number1=number-number1;
                number=number-number1;
                System.out.println("tha swap value of number :" +number);
                System.out.println("the swap value of number1 :" +number1);
            }
            else if (varible=='w')
            {
                System.out.println("with varible");
                int a,b,c;
                a=inputdo.nextInt();
                b=inputdo.nextInt();
                System.out.println("real value of a :" +a);
                System.out.println("real value of b :" +b);
                c=a;
                a=b;
                b=c;
                System.out.println("the swap value of a :"+a);
                System.out.println("the swap value of b :" +b);
            }
        }
    }
}
