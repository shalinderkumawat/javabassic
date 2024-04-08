patterns: 
1) 
****
****
****
**** 

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}


while +for loop 

2)
*
**
*** 

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
        for(int i=3;i>=1;i--)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}

while +for loop 
3)
***
**
* 

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
        for(int i=1;i<=3;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}


while +for loop 
4)
*
**
***
***
**
*

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=3;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}


while +for loop 

5)
*
**
***
**
*

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=2;i++)
        {
            for(int j=2;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}



6) 
12345
12345
12345
12345 
12345 

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}


7)
1111
2222
3333
4444 

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}


8) 
1
12
123
1234 

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}


 9)
1
22
333
4444 

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    
}

10) 
54321
54321
54321
54321
54321 

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
       for(int i=5;i>=1;i--)
       {
        for(int j=5;j>=1;j--)
        {
            System.out.print(j);
        }
        System.out.println("");
       }
    }
    
}


11)
55555
44444
33333
22222
11111


public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
       for(int i=5;i>=1;i--)
       {
        for(int j=5;j>=1;j--)
        {
            System.out.print(i);
        }
        System.out.println("");
       }
    }
    
}


12) 
  * 
 **
***

public class J {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
       for(int i=1;i<=3;i++)
       {
        for(int s=2;s>=i;s--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
       }

    }
    
    
}


13) 
*** 
 ** 
  *  	

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
       for(int i=3;i>=1;i--)
       {
        for(int s=2;s>=i;s--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
       }

    }
    
    
}


14)
  *
 **
***
***
 **
  * 

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
       for(int i=1;i<=3;i++)
       {
        for(int s=2;s>=i;s--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
       }
      for(int i=1;i<=3;i++)
      {
        for(int s=2;s<=i;s++)
        {
            System.out.print(" ");
        }
        for(int j=3;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println("");
      }

    }
    
    
}


15)
  *
 **
***
 **
  *

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
       for(int i=1;i<=3;i++)
       {
        for(int s=2;s>=i;s--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
       }
      for(int i=1;i<=2;i++)
      {
        for(int s=1;s<=i;s++)
        {
            System.out.print(" ");
        }
        for(int j=2;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println("");
      }

    }
    
    
}


16) 
    *   
   * *
  * * * 
 * * * *
* * * * * 

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
       for(int i=1;i<=3;i++)
       {
           for(int s=2;s>=i;s--)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print(" *");
           }
           System.out.println("");
       }
            

    }
    
    
}


17) 
###*
##**
#***
****

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
       for(int i=1;i<=3;i++)
       {
           for(int s=2;s>=i;s--)
           {
               System.out.print("#");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println("");
       }
            

    }
    
    
}


18) 
****
#***
##**
###* 


public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
       for(int i=1;i<=3;i++)
       {
           for(int s=2;s<=i;s++)
           {
               System.out.print("#");
           }
           for(int j=3;j>=i;j--)
           {
               System.out.print("*");
           }
           System.out.println("");
       }
            

    }
    
    
}


19) 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16 



	
public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
     int num=1;
       for(int i=1;i<=4;i++)
       {
           for(int j=1;j<=5;j++)
           {
               if(i==3||i==4||j==1||j==2||j==3||j==4)
               {
                   System.out.print(num+" ");
                   num++;
               }
           }
           System.out.println("");
       }

    }
    
    
}


 20) 
2 4 6 8 10 
12 14 16 18 20 
22 24 26 28 30 
32 34 36 38 40 
42 44 46 48 50 

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
     int num=1;
     int sum=2;
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=6;j++)
           {
               if(i==2||i==3||i==4||i==5||j==1||j==2||j==3||j==4||j==5)
               {
                   System.out.print(sum+" ");
                   num++;
                   sum=num*2;
               }
           }
           System.out.println("");
       }

    }
    
    
}


21)
1 2 3 4 5
2 4 6 8 10 
3 6 9 12 15
4 8 12 16 20 
5 10 15 20  25 

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
     int num=1;
     
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=5;j++)
           {
                   System.out.print(num+" ");
                   num++;
                   
               
           }
           System.out.println("");
       }

    }
    
    
}


22)(if else in for loop)
01010
10101
01010
10101


public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
     
     
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=5;j++)
           {
               if((j+i)%2==0){
                   System.out.print(1);
               }
               else 
               {
                   System.out.print(0);
               }
                   
               
           }
           System.out.println("");
       }

    }
    
    
}



23)
1 0 1 0 1
0 1 0 1 0 
1 0 1 0 1
0 1 0 1 0

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
     
     
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=5;j++)
           {
               if((j+i)%2==0){
                   System.out.print(1+" ");
               }
               else 
               {
                   System.out.print(0+" ");
               }
                   
               
           }
           System.out.println("");
       }

    }
    
    
}


24)
0 0 0 0 
1 1 1 1 
0 0 0 0 
1 1 1 1 

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
     
     
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=5;j++)
           {
               if(i%2==0){
                   System.out.print(0+" ");
               }
               else 
               {
                   System.out.print(1+" ");
               }
                   
               
           }
           System.out.println("");
       }

    }
    
    
}


25)
1 1 1 1 
0 0 0 0 
1 1 1 1 
0 0 0 0 

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
     
     
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=5;j++)
           {
               if(i%2==0){
                   System.out.print(1+" ");
               }
               else 
               {
                   System.out.print(0+" ");
               }
                   
               
           }
           System.out.println("");
       }

    }
    
    
}


1)
* * * *
 * * * 
  * * 
   * 

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
     
       for(int i=3;i>=1;i--)
       
       {
           for(int s=2;s>=i;s--)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print(" *");
           }
           System.out.println("");
       }

    }
    
    
}


2)
   *
  * *
 * * *
* * * * 
* * * *
 * * * 
  * * 
   * 

public class Main {
    public static void main(String [] args)
    {
        System.out.println("This is show pattern :");
     
     
       for(int i=1;i<=3;i++)
       
       {
           for(int s=2;s>=i;s--)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print(" *");
           }
           System.out.println("");
       }
for(int i=3;i>=1;i--)
       
       {
           for(int s=2;s>=i;s--)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print(" *");
           }
           System.out.println("");
       }

    }
    
    
}


9) 
*
* * 
*   *
* * * *


public class Main 
{
    public static void main(String[] args)
    {
        int i;
        int j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                if(i==4||j==1||i==j)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
                
            }System.out.println("");
        }
    }
}





