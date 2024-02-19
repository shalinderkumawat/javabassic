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

Q13 

reverse number :
input :64784
output :48746

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("revers number");
        int num=64784;
        int rem=0;
        int sum=0;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;

        }
        System.out.println(sum);
    }
}


Q14.

pallindrome :

156787651 pallindrome :yes |no



import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inputdo= new Scanner (System.in);
        int num=inputdo.nextInt();
        int rem=0;
        int sum=0;
        int temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;


        }
        if(sum==temp)
        {
            System.out.println("this number is pallindrom number");
        }
        else{
            System.out.println("this number is not pallinfrom number ");
        }
    }
}

Q15. armstrong number :
                       153


		       
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo = new Scanner (System.in);
        int num=inputdo.nextInt();
        int rem;
        int sum=0;
        int temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("this is armstrong number :");
        }
        else
        {
            System.out.println("this is not armstrong number :");
        }
    }
}


Q16. sum of digit :code 

  import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner inputdo= new Scanner (System.in);
        System.out.println("enter the sum of value :");
        int num=inputdo.nextInt();
        int rem;
        int sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
            
        }
        System.out.println(sum);
    }
}

Q17.  count digit :
                   6746357


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the N  number :");
        int num=inputdo.nextInt();
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        System.out.println("the all digites is :" +count);
    }
}

Q18. a :armstrong number 

p :pallindrome 


r :reverse number

c :count digit 

s :sum of digit 

o :sum of loop numbers 

w :(while loop)
	e :1-->100 (even number 1 to 100)
	d :100--->1 (odd numbers print)

f :(for loop)
	e :1-->100 (even number 1 to 100)
	d :100--->1 (odd numbers print)

l :factorial 

u :sum of loop number (for loop )


       import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("enter the character  a to :");
        char value=inputdo.next().charAt(0);
        if(value=='a')
        {
            System.out.println("this character is show to armstrong number :");
            int num=inputdo.nextInt();
            int rem;
            int sum=0;
            while(num>0)
            {
                rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }
            System.out.println("the armstrong number is :" + sum);

        }
        if(value=='p')
        {

            System.out.println("this character is show pallindron number :");
            int num=inputdo.nextInt();
            int rem;
            int sum=0;
            int temp=num;
            while(num>0)
            {
                rem=num%10;
                sum=sum*10+rem;
                num=num/10;

            }
            if(sum==temp)
            {
                System.out.println("this numbe is pallindrom number ");
            }
            else
            {
                System.out.println("this number is not pallindrom number");
            }
        }
        else if(value=='r')
        {
            System.out.println("this number is show revers number");
            int num=inputdo.nextInt();
            int rem;
            int sum=0;
            while(num>0)
            {
                rem=num%10;
                sum=sum*10+rem;
                num=num/10;

            }
            System.out.println(sum);
        }
        else if (value=='c')
        {
            System.out.println("this character is show totel number");
            int num=inputdo.nextInt();
            int count=0;
            while(num>0)
            {

                num=num/10;
                count++;
            }
            System.out.println(count);
        }
        else if(value=='o')
        {
            System.out.println("this character is show the sum of number");
            int num=inputdo.nextInt();
            int rem;
            int sum=0;
            while(num>0){
                rem=num%10;

                sum=sum+rem;
                num=num/10;

            }
            System.out.println(sum);
        }
        else if(value=='l')
        {
            System.out.println("this character is show totel number sum :");
            int num=inputdo.nextInt();
            int last=inputdo.nextInt();
            int sum=0;
            while (num<=last)
            {
                sum=sum+num;

                num++;
                System.out.println("the number is :" +num);
            }
            System.out.println("the sum of totel number :"+sum);
        }
        else if(value=='w')
        {
            System.out.println("this character is show while loop counting odd and even number");
            char character=inputdo.next().charAt(0);
            if(character=='e')
            {
                System.out.println("this character is show even number");
                int num=inputdo.nextInt();
                int last=inputdo.nextInt();
                while(num<=last)
                {
                    num++;
                    while(num%2==0)
                    {
                        System.out.println("the even number :"+num++);
                    }
                }
            }
            else if(character=='d')
            {
                System.out.println("thie character is show odd number :");
                int number=inputdo.nextInt();
                int last=inputdo.nextInt();
                while(number>=last)
                {
                    number--;
                    while(number%2!=0)
                    {
                        System.out.println(number--);
                    }
                }
            }

        }
        else if(value=='t')
        {
            System.out.println("this character is print table whith for  and while loop ");
            char vlue=inputdo.next().charAt(0);
            System.out.println("enter the chatacter ;like : f : w");
            if(vlue=='w')
            {
                System.out.println("this characte is print the table with while loop");
                int num=inputdo.nextInt();
                int a=1;
                while(a<=10)
                {
                    System.out.println(num + " * " + a + " = " + (num*a));
                    a++;
                }
            }
            else if(vlue=='f')
            {
                System.out.println("this character is show table with for loop");
                int num=inputdo.nextInt();
                System.out.println("enter the table number :");
                for(int i=1;i<=10;i++)
                {
                    System.out.println(num + " * " + i + " = " + (num*i));
                }
            }
        }
        else if(value=='y')
        {
            System.out.println("this character is show calcluter :");
            System.out.println("enter the character like : a d s m o :");
            char hi=inputdo.next().charAt(0);

            if(hi=='a')
            {
                int num=inputdo.nextInt();
                int num1=inputdo.nextInt();
                System.out.println( num + " + " + num1 + " = " + (num+num1));
            }
            else if(hi=='s')
            {
                System.out.println("this cahracter is show subtraction : ");
                System.out.println("enter the number :");
                int a=inputdo.nextInt();
                int b=inputdo.nextInt();
                System.out.println(a + " - " + b + " = " + (a-b));
            }
            else if(hi=='d')
            {
                System.out.println("this cahracter if show divide :");
                System.out.println("enter the number of divide :");
                int a=inputdo.nextInt();
                int b=inputdo.nextInt();
                System.out.println(a + " / " + b + " = " + (a/b));
            }
            else if (hi=='m')
            {
                System.out.println("this character is show multiply");
                System.out.println("enter the number : ");
                int a=inputdo.nextInt();
                int b=inputdo.nextInt();
                System.out.println(a + " * " + b + " = " + (a*b));

            }
            else if(hi=='o')
            {
                System.out.println("this character is show modlur ");
                System.out.println("enter the number :");
                int a=inputdo.nextInt();
                int b=inputdo.nextInt();
                System.out.println(a + " % " + b + " = " + (a%b));
            }
        }
    }
}


