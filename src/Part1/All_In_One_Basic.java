package Part1;



import java.util.Scanner;

public class All_In_One_Basic {
    Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Program Started");
        swap();



        System.out.println("program end..");
    }
    public static void swap(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Before swap : ");
        System.out.print("a="+a +  " b="+b );

        a=a+b;
        System.out.println();
        System.out.println("After swap : ");
        b=a-b;
        a=a-b;
        System.out.println("a="+a +  " b="+b );

    }
}
