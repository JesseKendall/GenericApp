import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 GenericContainer class is a generic container for storing and manipulating data of any type.
    It provides methods to add, remove, retrieve, determine the size, sort, and print the data.
    <T> the type of the elements in this container
*/
public class GenericContainer<T> {
    private ArrayList<T> items;

    // Constructor to initialize the GenericContainer.
    public GenericContainer() {
        items = new ArrayList<>();
    }

    // Adds an item to the container.
    public void add(T item) {
        items.add(item);
    }

    // Removes an item from the container.
    public void remove(T item) {
        items.remove(item);
    }

    // Retrieves an item from the container by index.
    public T retrieve(int index) {
        return items.get(index);
    }

    // Returns the size of the container.
    public int size() {
        return items.size();
    }

    // Sorts the items in the container using the specified comparator.
    // (Comparator<? super T> comparator) ensures tht the comparator you pass to the sort method
    //      can compare elements of type T or any type that T inherits.
    public void sort(Comparator<? super T> comparator) {
        Collections.sort(items, comparator);
    }

    // Prints all the items in the container.
    public void print() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}