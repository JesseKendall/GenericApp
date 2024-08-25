/* FindPosition class contains a generic method <T> to find the index of a value in an array.
        The method uses generics to work with arrays of any reference type.
        Generic method to find the index of a value in an array
*/
public class FindPosition {
    // <T> indicates the method is generic, and returns an integer
    // the returned int is the index of the value in the array
    public <T> int findIndex(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            // the .equals method compares the element at index i with the value (both passed in as parameters)
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1; // returns -1 if the value is not found - this is conventional
    }
}
