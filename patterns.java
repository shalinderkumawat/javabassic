Q1.

****
****
****
****

 import java.util.*;
public class Main
{
    public static void main (String[] args)
    {
     for(int i=1;i<=4;i++)
     
        {
            for(int j=1;j<=4;j++)
            {
              
                    System.out.print("*");
                
            }
            }
            System.out.println();
        }
    }

Q2.

****
*  *
*  *
****

 import java.util.*;
public class Main
{
    public static void main (String[] args)
    {
     for(int i=1;i<=4;i++)
     
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||i==4||j==1||j==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
    }
}

Q3.

*
**
***
****

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        for (int i=4;i>=1;i--)
        {
            for ( int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public class Main{
    public static void main(String[] args)
    {
        for(int i=1;i<=3;i++)
        {
            for (int j=3;j>=i;j--)
            {
                if(i==3||i==1||j==1||j==3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }System.out.println(" ");
        }
    }



    }


Q4.


   *
  **
 ***
**** 


public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for(int s=3;s>=i;s--)
            {
                    System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
Q5.

user input star print like;
*
**
***
****

n number 

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        int star=inputdo.nextInt();
        for(int i=1;i<=star;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}


Q6.  

user input star print.
like this ;

*****
****
***
**
*


import java.util.*;
public class Main{
    public static void main(String[] aegs)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.print("enter the n number of star");
        int star=inputdo.nextInt();
        for (int i=1;i<=star;i++)
        {
            for(int j=star;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



Q7. 

****
***
**
*

public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for (int j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

Q8.

*
**
***
***
**
*

public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


Q9.

*
**
***
**
*

public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i=1;i<=2;i++)
        {
            for (int j=2;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


Q10.
1
22
333
4444

public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}



Q11

1
00
111
0000


public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if(i%2==0)
                {
                    System.out.print("0");
                    
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}


Q12.

1
12
123
1234

public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



Q13.

1
10
101
1010

 public class Main{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("0");
                }
                else 
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}


Q14.

1
23
456
78910

public class Main{
    public static void main(String[] args)
    { int a=1;
        for (int i=1;i<=4;i++)
        {

            for (int j=1;j<=i;j++)
            {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}


Q15.

   *
  **
 ***
****

public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for(int s=3;s>=i;s--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


Q16.

****
 ***
  **
   *

   public class Main{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for (int s=0;s<=i;s++)
            {
                System.out.print(" ");
            }
            for (int j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


Q17.

   *
  **
 ***
****
****
 ***
  **
   *


public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for (int s=3;s>=i;s--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=4;i++)
        {
            for(int s=0;s<=i;s++)
            {
                System.out.print(" ");
            }
            for(int j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



Q18.

   *
  **
 ***
****
 ***
  **
   *


   public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for (int s=3;s>=i;s--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=3;i++)
        {
            for(int s=0;s<=i;s++)
            {
                System.out.print(" ");
            }
            for (int j=3;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


Q19.

  *
 * *
* * *


public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=3;i++)
        {
            for(int s=2;s>=i;s--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


Q20.

* * *
 * *
  *


  public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=3;i++)
        {
            for(int s=0;s<=i;s++)
            {
                System.out.print(" ");
            }
            for (int j=3;j>=i;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

Q21.


  *
 * *
* * *
* * *
 * *
  *


  public class Main{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for (int s=3;s>=i;s--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++)
        {
            for (int s=0;s<=i;s++)
            {
                System.out.print(" ");
            }
            for (int j=4;j>=i;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}



Q22.



  *
 * *
* * *
 * *
  *
public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for (int s=3;s>=i;s--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i=1;i<=3;i++)
        {
            for (int s=0;s<=i;s++)
            {
                System.out.print(" ");
            }
            for (int j=3;j>=i;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        
    }
}


Q23.


****
*  *
****
*  *
*  *




public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=4;j++)
            {
                if(i==1||i==3||j==1||j==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}


Q24.

****
*
*
*



public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=4;j++)
            if(i==1||j==1)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            System.out.println();
        }
}

Q25.

*
 *
  *
   *
    *
    
public class Main{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if(i==j){
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


Q26.

    *
   *
  *
 *
*


public class Main{
    public static void main(String[] args)
    {
        for(int i=5;i>=1;i--)
        {
            for (int j=1;j<=5;j++)
            {
                if(j==i){
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

Q27.


****
*
*
****


public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||j==1||i==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


Q28.



****
   *
   *
****

public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||j==4||i==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




Q29.


****
*  *
*  *
*  *



public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||j==4||j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


Q30.

****
*  *
****
*  *
****


  public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||j==4||j==1||i==3||i==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




Q31.

****
*
****
*
*



public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||j==1||i==3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

Q32.

*  *
*  *
****
*  *
*  *


public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==3||j==1||j==4)
                {
                    System.out.print("*");


                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


Q33.


*****
  *
  *
  *
*****




public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==1||i==5||j==3)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}


Q34.

*
*
*
****




public class Main{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for (int j=1;j<=4;j++)
            {
                if(i==4||j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

Q35.

****
 *
  *
****


public class Main{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||i==4||i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


Q36.

****
  *
 *
****

public class Main{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=1;j--)
            {
                if(i==1||i==4||j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


Q37.

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********


public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=8;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(i==1||i==8||j==1||j==8||j==i||i+j==9)                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}


Q38.

********
**
* *
*  *
*   *
*    *
*     *
*      *



public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=8;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(i==1||j==1||j==i)                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}


Q39.

*      *
 *     *
  *    *
   *   *
    *  *
     * *
      **
********


public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=8;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(i==8||j==8||j==i)                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}


Q40.

********
      **
     * *
    *  *
   *   *
  *    *
 *     *
*      *



public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=8;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(i==1||j==8||i+j==9)                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}

Q41.

*      *
*     *
*    *
*   *
*  *
* *
**
********


public class Main{
    public static void main(String[] args)
    {
        for (int i=1;i<=8;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(i==8||j==1||i+j==9)                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}



