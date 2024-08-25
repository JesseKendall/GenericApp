import java.util.Comparator;

/* Name: Jesse Jittan
Course: COP 3330C – 31953
Date: 6/26/2024
Program Objective:
    GenericsInAction demonstrates GenericContainer functionality with Game of Thrones houses:
    House Stark, House Targaryen, and House Lannister.
    Operations include:
        - Creating and adding instances to GenericContainers
        - Printing container contents
        - Sorting containers by different attributes
        - Removing and retrieving items
        - Printing container sizes
 */
public class GenericsInAction {
    public static void main(String[] args) {
        // Creating instances of HouseStark, HouseTargaryen, and HouseLannister
        HouseStark stark1 = new HouseStark("Eddard Stark", 45, "Warden of the North");
        HouseStark stark2 = new HouseStark("Arya Stark", 18, "Assassin");
        HouseStark stark3 = new HouseStark("Sansa Stark", 25, "Queen in the North");

        HouseTargaryen targaryen1 = new HouseTargaryen("Daenerys Targaryen", "Drogon", 7);
        HouseTargaryen targaryen2 = new HouseTargaryen("Rhaegar Targaryen", "Balerion", 25);
        HouseTargaryen targaryen3 = new HouseTargaryen("Viserys Targaryen", "None", 2);

        HouseLannister lannister1 = new HouseLannister("Tywin Lannister", 1000.0, "Hear Me Roar!");
        HouseLannister lannister2 = new HouseLannister("Cersei Lannister", 800.0, "A Lannister Always Pays His Debts");
        HouseLannister lannister3 = new HouseLannister("Jaime Lannister", 500.0, "Hear Me Roar!");

        // Creating GenericContainers for each house
        // Each container is specifically typed to store objects of a specific house
        GenericContainer<HouseStark> starkContainer = new GenericContainer<>();
        GenericContainer<HouseTargaryen> targaryenContainer = new GenericContainer<>();
        GenericContainer<HouseLannister> lannisterContainer = new GenericContainer<>();

        // Adding items to the containers
        starkContainer.add(stark1);
        starkContainer.add(stark2);
        starkContainer.add(stark3);

        targaryenContainer.add(targaryen1);
        targaryenContainer.add(targaryen2);
        targaryenContainer.add(targaryen3);

        lannisterContainer.add(lannister1);
        lannisterContainer.add(lannister2);
        lannisterContainer.add(lannister3);
        lannisterContainer.add(stark3);
        // Demonstrating functionality
        System.out.println("House Stark:");
        starkContainer.print();
        System.out.println("House Targaryen:");
        targaryenContainer.print();
        System.out.println("House Lannister:");
        lannisterContainer.print();

        // Sorting House Stark by name
        starkContainer.sort(Comparator.comparing(HouseStark::getName));
        System.out.println("Sorted House Stark by Name:");
        starkContainer.print();

        // Sorting House Targaryen by reign years
        targaryenContainer.sort(Comparator.comparingInt(HouseTargaryen::getReignYears));
        System.out.println("Sorted House Targaryen by Reign Years:");
        targaryenContainer.print();

        // Removing a Lannister and printing the remaining
        lannisterContainer.remove(lannister2);
        System.out.println("House Lannister after removal:");
        lannisterContainer.print();

        // Demonstrating retrieve method
        System.out.println("Retrieve a House Stark at index 1:");
        HouseStark retrievedStark = starkContainer.retrieve(1);
        System.out.println(retrievedStark);

        // Demonstrating size method
        System.out.println("Size of House Stark container: " + starkContainer.size());
        System.out.println("Size of House Targaryen container: " + targaryenContainer.size());
        System.out.println("Size of House Lannister container: " + lannisterContainer.size());
    }
}