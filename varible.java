varible

In this java language thair three types varible


1: local varible;
2: instance varible;
3: static varible;

1; local varible:
  			declared = insid body {}, methed paramater ()

	Syntex:
	      void (int a)&
	      void ()
			{
				int a;
			}

2: instance varible :
			declared = insid class or out side mathuods;

	Syntex:
	       class K
			{
				int a;
				public static void main(String[] args){}
			}
3; stsic varible :
 			declared = int class , with static keyword;
	Syntex:
	  	class J
			{
				static int a;
			}

ex;

public class Main
{
    static int b=10;//static varible;
    int c=23;// Inside varible;

    public static void main(String[] args)
    {
        int a=10;// local varible;
        System.out.println(a);
        System.out.println(Main.b);//Static varibe class maimber;
        Main ref=new Main();
        System.out.println(ref.c);//inside varibe need to class object;


    }
}


