 week name

 import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Enter the day number : ");
        int day=inputdo.nextInt();
        String dayname;
        switch(day)
        {
            case 1: dayname="sunday";
            break;
            case 2: dayname="monday";
            break;
            case 3: dayname="tuesday";
            break;
            case 4: dayname="wednesday";
            break;
            case 5: dayname="thrusday";
            break;
            case 6: dayname="friday";
            break;
            case 7: dayname="saturday";
            break;
            default:
                    dayname="day not match";
                    break;
        }
        System.out.println("Today is : " + dayname);
    }
}


month name;

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Enter the month number : ");
        int month=inputdo.nextInt();

        String name;
        switch(month)
        {
            case 1:
                name="january";
                break;
            case 2: name="february";
            break;
            case 3: name="march";
            break;
            case 4: name="april";
            break;
            case 5: name="may";
            break;
            case 6: name="june";
            break;
            case 7: name="july";
            break;
            case 8: name="august";
            break;
            case 9: name="september";
            break;
            case 10: name="october";
            break;
            case 11: name="november";
            break;
            case 12: name="december";
            break;
            default : name="month number are not match";
            break;
        }
        System.out.print ("MONTH IS ::  " + name);
    }

}


Q .  create the program in java language in neasted switch case 
     EX. your are collage student and you entered the sem1 so sem1 all subject list to print in your output
       
     import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("you are student of maharishi arvind university");
        System.out.println("Enter your semester number : ");
        int sem= inputdo.nextInt();
        switch(sem)
        {
            case 1: String sub[] =new String[5];

            sub[0]="communitation english";
            sub[1]="communitation english";
            sub[2]="communitation english";
            sub[3]="communitation english";
            sub[4]="communitation english";
            for(int a=0;a<5;a++)
            {
                System.out.println(sub[a]);
            }
            break;
            default : System.out.println("this number is not valide");
        }
    }
}



