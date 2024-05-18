package InstanceInitizerBlock;

public class Tester {
    {
        System.out.println("Inside instance initializer block");
    }

    Tester(){
        System.out.println("Inside constructor");
    }

    public static void main(String[] arguments) {
        Tester test = new Tester();
    }
}

/**
 * Example 2: Demonstrating Whether Constructor Overrides Instance Initializer Block.
 *
 *
 * public class Tester {
 *    int a;
 *    {
 *       System.out.println("Inside instance initializer block");
 *       a = 10;
 *    }
 *
 *    Tester(){
 *       System.out.println("Inside constructor");
 *       a = 20;
 *    }
 *
 *    public static void main(String[] arguments) {
 *       Tester test = new Tester();
 *       System.out.println("Value of a: " + test.a);
 *    }
 * }
 * -------------------------------------------------------------------
 * OUTPUT:-
 * -------------------------------------------------------------------
 * Inside instance initializer block
 * Inside constructor
 * Value of a: 20
 * */
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/**
 * Example 3: Instance Initializer Block and Super Constructor
 *
 *
 * class SuperTester{
 *    SuperTester(){
 *       System.out.println("Inside super constructor");
 *    }
 * }
 *
 * public class Tester extends SuperTester {
 *    int a;
 *    {
 *       System.out.println("Inside instance initializer block");
 *       a = 10;
 *    }
 *
 *    Tester(){
 *       System.out.println("Inside constructor");
 *    }
 *
 *    public static void main(String[] arguments) {
 *       Tester test = new Tester();
 *       System.out.println("Value of a: " + test.a);
 *    }
 * }
 * ----------------------------------------------------------------------
 * OUTPUT:-
 * ----------------------------------------------------------------------
 * Inside super constructor
 * Inside instance initializer block
 * Inside constructor
 * Value of a: 10
 * */
