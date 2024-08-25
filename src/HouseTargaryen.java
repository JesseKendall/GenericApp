// HouseTargaryen class represents a member of House Targaryen from Game of Thrones.
// It stores the name, dragon, and reign years of the member.
public class HouseTargaryen {
    private String name;
    private String dragon;
    private int reignYears;

    // Constructor to initialize a HouseTargaryen object.
      public HouseTargaryen(String name, String dragon, int reignYears) {
        this.name = name;
        this.dragon = dragon;
        this.reignYears = reignYears;
    }

    // Getters
        public String getName() {
        return name;
    }

        public String getDragon() {
        return dragon;
    }

    public int getReignYears() {
        return reignYears;
    }

    // Setters
        public void setName(String name) {
        this.name = name;
    }

        public void setDragon(String dragon) {
        this.dragon = dragon;
    }

        public void setReignYears(int reignYears) {
        this.reignYears = reignYears;
    }

    //toString method overridden that returns a string representation of the HouseTargaryen object.
    @Override
    public String toString() {
        return "HouseTargaryen{name='" + name + "', dragon='" + dragon + "', reignYears=" + reignYears + "}";
    }
}