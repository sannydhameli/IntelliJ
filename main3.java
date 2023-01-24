import java.util.ArrayList;
import java.util.Date;



class  PantsException extends Exception
{

}

class  LingerieException extends Exception
{

}

class Laundry {

    public void doLaundry() throws PantsException, LingerieException {
// code that could throw either exception }


        throw new PantsException();  // create new pant type exception object and throw in class
    }
}


class foo5
{
    static final int x=3;

    static void  go(final int x)
    {
        System.out.println(x);
    }
}
class  test
{
    int x;

     test()
    {
        System.out.println("test class constructor");
    }

    final void test_cheak() // using this final keyword we can not overridden this method
    {
        System.out.println("this test method");
    }
}


 class test2 extends test
 {
     test2()
     {

         System.out.println("i am test2 by default constructor");
     }

     test2(int x)
     {
         super();// calling upper class constructor
         System.out.println( x + " i am one extra one constructor");
     }
 }

 class static_type
 {

     static void one()
     {
         System.out.println("this is one");
     }

     static void two()
     {
         System.out.println("this is two");
     }

     void three()
     {
         System.out.println("this is three");
     }

 }
public class main3
{
    private  main3() // write public constructor now body out side the class creating obj of this particular class
    {
        System.out.println("hello i am m3 obj ");
    }
     public static void main(String args[])
     {


         Laundry laundry = new Laundry();
         try {
             laundry.doLaundry();
             System.out.println("try");
         } catch(PantsException pex) {
// recovery code
             System.out.println("catch1");
         } catch(LingerieException lex)
         {
             System.out.println("catch2");
// recovery code
         }

         test t = new test(); // calling the test constructor.
         t.test_cheak(); // different then constructor

         main3  m3 = new main3();

         test2 t2 = new test2(3);

         Math mathob = null;
         System.out.println(mathob.max(10,11));

         System.out.println(Math.max(10,25));

         static_type.one();
         static_type.two();
         // static_type.three();  we can not do this because three is not static type class

         static_type st = new static_type();

         st.three();

         foo5 f5=new foo5();

         f5.go(10);
         foo5.go(11);

         ArrayList<Integer> al = new ArrayList<Integer>();

         al.add(10);
         al.add(20);
         int x=10;
         System.out.println(al.get(0));

         String str = String.format("%,d",1000000); // this is use to convert in string format also with commas include

         System.out.println(str);
         str=String.format("this is %,8.2f",1.11123);
         System.out.println(str);

         System.out.println(String.format("%tc",new Date()));
         System.out.println(String.format("%tr",new Date()));









     }
}