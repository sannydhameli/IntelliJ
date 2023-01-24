import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

 abstract class animal  // we can not crete  any object of this type of class
{
    String type;
    int iage;

    void voice(String str)
    {
        System.out.println("animal type voice" + str);
    }


    void tem()
    {
        System.out.println("tem class in animal");
    }

    abstract void ab_mathod();  // create abstract method : it is use for now subclass responsibility that create this function in there own subclass.


}
class dog extends animal
{
    String name;
    int age;

    void bark()
    {
        System.out.println("bhaw bhaw");
    }

    void tem()
    {
        System.out.println("tem class in dog");
    }

    void voice(String str)
    {
        super.voice(str); // this keyword use to call the super class mathod
        super.tem();
       // voice(str); recursion calling get error
        System.out.println("dog type voice " + str + " i am dog");
    }

    void ab_mathod()
    {
        System.out.println(" hello this is abstract method");
    }

    void cheak()
    {
        System.out.println("hello i am animal");
    }

}

final class cat extends animal  // using final class no body extend this cat class more further.
{
    String name;
    int age;

    void ab_mathod()
    {
        System.out.println(" hello this is abstract method");
    }
    void bark()
    {
        System.out.println("miyuuaaa miyauuu");
    }

}

class hippo extends animal
{
    String name;
    int age;

    void bark()
    {
        System.out.println("hiuuuu hiuuu");
    }

    void ab_mathod()
    {
        System.out.println(" hello this is abstract method");
    }

}


class TestClass
{

    static int xx;

    public  static void main(String[] args)
    {

         int x;
         int y= xx + 3;

        System.out.println(y);

        String num = "18";
        int numi = Integer.parseInt(num); // convert string to Integer
        System.out.println(numi);

        dog d1 = new dog();

        d1.voice("sherruuu");



        d1.name = "shiro";
        d1.age = 14;
        d1.type = "dog";
        d1.iage = 18;


        d1.voice("bhoww bhowwwww");


        System.out.println(d1.type);
        System.out.println(d1.iage);

        dog d2=d1;  // when crete copy constructor use to copies of object when change in one it same change in copies object d1---> d2,d2--->d1.

        d1.bark();

        System.out.println(d1.name);
        System.out.println(d2.name);

        d2.name = "hii";

        System.out.println(d1.name);
        System.out.println(d2.name);

        dog[] dogs = new dog[3];

        dogs[0] = new dog();


        dogs[0].name = "tommy"; // here we have to give every index created thier seprated objects

        System.out.println(dogs[0].name);

//        float[] arry = {1,2,3,4,5};
//
//        for(float i:arry)
//        {
//            System.out.println(i);
//        }

        ArrayList<dog> MyList = new ArrayList<dog>(); // int[] arry = new int[4];

        dog d3= new dog();

        MyList.add(d1);
        MyList.add(d2);
        MyList.add(d3);

        int s=MyList.size();
        boolean is_present = MyList.contains(d1);
        int index = MyList.indexOf(d3);


        System.out.println(s);
        System.out.println(is_present);
        System.out.println(index);



        dog d4 = MyList.get(index);
        MyList.remove(d2);
        MyList.remove(1);

        System.out.println(MyList.size());

        System.out.println(d4.name);



        animal mydog = new dog() ;// dog mydog  = new dog();
        cat mycat = new cat(); //

       mydog.type = "hey i am dog";
       mydog.iage = 16;

       mycat.name = "hey i am cat";
       mycat.age = 20;

        System.out.println(mydog.type + mydog.iage);
       // System.out.println(mydog.name); we can not use of the dog class of the function
        System.out.println(mycat.name + mycat.age);

       // mydog = mycat;



   // animal a1 = new animal(); // when we Declaer the abstract class then we can not make any object of this class but we can use it as reference variable.

        animal a1=d1;

        a1.tem();
        d1.tem();

        a1.voice("animal");
        d1.voice("dogggy");


        d1.cheak();  // if there is two funtion

        d1.ab_mathod();

      ArrayList<Object> Al = new ArrayList<Object>(); //ArrayList<dog>

        // EVERY CLASS IN JAVA IS SUBLCASS OF THE OBJECT CLASS SO HEAR WE USE IT (Object ---> animal class also it can be use because cat and dog are subclass of animal class)

      Al.add(d1);
      Al.add(mycat);

      dog temgdog  = (dog)Al.get(0);

        System.out.println(d1.name);

        System.out.println(temgdog.name);














    }
}