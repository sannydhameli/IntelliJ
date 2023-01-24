import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//public class Main
//{
//
//    public static  void printJava()
//    {
//        System.out.println("hello java");
//    }
//
//    public static  void printName(String name)
//    {
//        System.out.println(name);
//    }
//
//    public static  int sum(int a,int b)
//    {
//        return a+b;
//
//    }
//    public static void main(String[] args)
//    {
//        System.out.println("Hello world! my name is sanny");
//        System.out.print("hii\n");
//        System.out.print("hello");
//        System.out.println();
//        // sout + tab use it
//
//
//        String name = "sanny";
//        int age = 18;
//
//        String friend = "keval";
//
//        System.out.println(name);
//
//     // byte,int,long,float,double,string,char
//
//        int phone = 1234567890;
//        long phone2 = 12345678911L;
//        boolean is_true = true;
//
//        // Non primitive types;
//
//
//        String tem = "dhameliya";
//
//        System.out.println(tem);
//        System.out.println(tem.length());
//
//        String newname = new String("sanny123"); // non primitiv
//        System.out.println(newname);
//
//        System.out.println(tem.charAt(0));
//         String tem2 = tem.replace('a','d');
//        System.out.println(tem2);
//
//        System.out.println(tem.substring(2,3));3

        // arry

//      int[]  arry = new int[3];
//      arry[0]=99;
//      arry[1]=97;
//      arry[2]=95;
//
//        System.out.println(arry[0]);
//
//        System.out.println(arry.length);
//
//        Arrays.sort(arry);
//        System.out.println(arry[0]);
//
//        int[] marks = {93,91,92};
//        int[][] finalMarks = {{1,2,3},{4,5,6},{7,8,9}};
//
//        System.out.println(finalMarks[0][0]);
//
//
//        //Casting
//
//        int p = 100;
//
//        int fp = p + (int)18.0;  // int capacity is small so it can not fit in double var
//
//        System.out.println(fp);
//
//        int iage = 18;
//        iage = 12;
//
//        final float cons = 16; // this final keyword make constant it
//
//        // operators +,-,*,/
//
//      int a=1;
//      int b=2;
//
//      double div = (double) a/b;
//      System.out.println(div);
//
//      a++;//2
//
//      System.out.println(a++);
//      System.out.println(a);



      // Maths
//      System.out.println(Math.min(10,11));
//      System.out.println((int)(Math.random()*100));
//
//    // how to take input?
//
   //   Scanner sc = new Scanner(System.in);
//      System.out.println("input your age: ");
//
//      int ageinput = sc.nextInt();
//      System.out.println(ageinput);

       // String name = sc.nextLine();
        //System.out.println(name);

      // comparison  operators
      // a==b , a!=b,a<b,a>b,a<=b,a>=b

//      int age=20;
//      int iage=30;
//
//
//      if(age>20 || iage==30)
//          System.out.println("yes");
//      else if(age==20)
//          System.out.println("it can");
//      else
//          System.out.println("no");

       // switch system
    //   Scanner sc = new Scanner(System.in);

      // int day = sc.nextInt();

//       switch (day)
//       {
//           case 1:
//               System.out.println("sunday");
//               break;
//           case 2:
//               System.out.println("monday");
//               break;
//           default:
//               System.out.println("wed-fr");
//       }
//
//


      // LOOPS : for ,while,do while

//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(i);
//        }
//
//        int k=98;
//
//        do {
//            System.out.println("yes");
//            k++;
//        }while(k!=100);

//   int num=0;
//
//    do
//    {
//        System.out.println("input your num: ");
//        num = sc.nextInt();
//        System.out.println("here is your num: ");
//        System.out.println(num);
//
//    }while (num>=0);
//
//        System.out.println("END");


        // Break or continue;
        // try - catch i exception handling

//        int[] marks = {94,96,91};
//
//        try
//        {
//            System.out.println(marks[5]);
//        }
//        catch(Exception exception)
//        {
//            // do something after catching
//           // System.out.println(exception);
//        }
//
//        System.out.println("the name is Sanny");



        // Methods

//        printJava();
//        printJava();
//        printJava();
//
//        printName("aman");
//
//        int c = sum(10,20);
//        System.out.println(c);

//        Scanner sc = new Scanner(System.in);
//
//     int num1 = (int)(Math.random()*100);
//     int num2 = 0;
//
//
//     do {
//         System.out.println("Enter your num ");
//          num2 = sc.nextInt();
//
//         if(num2==num1)
//         {
//             System.out.println("done");
//             break;
//         }
//         else if(num2> num1)
//         {
//             System.out.println("your number is big");
//         }
//         else
//         {
//             System.out.println("your number is too small");
//         }
//     }while(num2 >=0);
//
//        System.out.println("my number is  : " + num1);
//
//    }
//}