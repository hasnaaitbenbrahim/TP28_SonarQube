package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String unused = "I am unused"; // Code Smell: Unused variable
        
        if (true) { // Bug: Condition always true
            System.out.println("This is always executed");
        }
        
        int x = 10;
        if (x == 10) {
            System.out.println("Magic number"); // Code Smell: Magic number, use constant
        }
        
        // TODO: Fix this later // Code Smell: TODO comment
    }
}
