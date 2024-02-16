Q1 use the data type and store the your name

   public class Main

{
    public static void main(String[] args)
    {
        String name="shalinder kumawat";
        System.out.print(name);
    }
}

Q2. user input give the some lines and this line word to count

import java.util.*;

public class Main{
    public static void main(String[] args)
{
    Scanner input=new Scanner (System.in);

    String name;
    name=input.nextLine();
    System.out.print("name"+name.length());
}
}

Q3. useing the string and toUpperCase to print the hello world


import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        String print=input.nextLine();
        System.out.print(print.toUpperCase());
    }
}


Q4. useing the string and toLowerCase and count thecharacter 

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);

        String tolowercase=input.nextLine();
        System.out.print(tolowercase.toLowerCase()+tolowercase.length());
    }
}


