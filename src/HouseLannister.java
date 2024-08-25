// HouseLannister class represents a member of House Lannister from Game of Thrones.
// It stores the name, wealth, and motto of the member.

public class HouseLannister {
    private String name;
    private double wealth;
    private String motto;

    // Constructor to initialize a HouseLannister object.
    public HouseLannister(String name, double wealth, String motto) {
        this.name = name;
        this.wealth = wealth;
        this.motto = motto;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getWealth() {
        return wealth;
    }

    public String getMotto() {
        return motto;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWealth(double wealth) {
        this.wealth = wealth;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    // toString method overridden that returns a string representation of the HouseLannister object.
    @Override
    public String toString() {
        return "HouseLannister{name='" + name + "', wealth=" + wealth + ", motto='" + motto + "'}";
    }
}