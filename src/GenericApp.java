import java.util.Comparator;

/**
 * GenericApp class demonstrates the functionality of GenericContainer with
 * HouseStark, HouseTargaryen, and HouseLannister objects.
 */
public class GenericApp {
    public static void main(String[] args) {
        // Creating instances of HouseStark
        HouseStark stark1 = new HouseStark("Eddard Stark", 45, "Warden of the North");
        HouseStark stark2 = new HouseStark("Arya Stark", 18, "Assassin");
        HouseStark stark3 = new HouseStark("Sansa Stark", 25, "Queen in the North");

        // Creating GenericContainer for HouseStark
        GenericContainer<HouseStark> starkContainer = new GenericContainer<>();

        // Adding HouseStark instances to the container
        starkContainer.add(stark1);
        starkContainer.add(stark2);
        starkContainer.add(stark3);

        // Printing contents of HouseStark container
        System.out.println("House Stark:");
        starkContainer.print();

        // Sorting HouseStark container by name and printing sorted contents
        starkContainer.sort(Comparator.comparing(HouseStark::getName));
        System.out.println("Sorted House Stark by Name:");
        starkContainer.print();

        // Retrieving an item from HouseStark container by index
        System.out.println("Retrieve a House Stark at index 1:");
        HouseStark retrievedStark = starkContainer.retrieve(1);
        System.out.println(retrievedStark);

        // Printing size of HouseStark container
        System.out.println("Size of House Stark container: " + starkContainer.size());
    }
}