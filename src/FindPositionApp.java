/* Name: Jesse Jittan
Course: COP 3330C – 31953
Date: 6/26/2024
Program Objective:
        FindPositionDemo class demonstrates the use of the FindPosition class's generic method.
        It creates arrays of different types (Integer, String, Double) and finds the index
        of specified values.
        I also wanted to demonstrate the use of the -1 return when the value does not exist,
        therefore I choose a random value for the Double[] to demonstrate this.
 */

public class FindPositionApp {
    public static void main(String[] args) {
        // Create an instance (object) of the FindPosition class
        FindPosition find = new FindPosition();

        //Testing with an array of integers
        // Creates an array of integers, then calls the findIndex method with the intArray and value 8 as arguments
        //      then prints the index to the console.
        Integer[] intArray = {2, 4, 6, 8};
        int intIndex = find.findIndex(intArray, 8);
        System.out.println("The index of the value 8: " + intIndex);

        //Testing with an array of strings
        // Creates an array of Strings, then calls the findIndex() with the strArray and value cherry as arguments
        String[] strArray = {"watermelon", "orange", "cherry", "grape"};
        int strIndex = find.findIndex(strArray, "cherry");
        System.out.println("The index of cherry is in: " + strIndex);

        //Testing with an array of doubles
        // Creates an array of doubles, then calls teh findIndex() w. the dblArray and value 2.6 as arguments
        Double[] dblArray = {2.2, 3.1, 1.0, 8.2};
        int dblIndex = find.findIndex(dblArray, 2.6);
        System.out.println("I am testing the -1 method when the value does not exist: " + dblIndex);

    }
}
