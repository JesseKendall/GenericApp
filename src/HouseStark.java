import java.lang.reflect.Constructor;

/* HouseStark class represents a member of House Stark from Game of Thrones.
        It stores the name, age, and role of the member.
 */
public class HouseStark {
    private String name;
    private int age;
    private String role;

    // Constructor to initialize a HouseStark object.
    public HouseStark(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // Getters
      public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //toString method ovreridden that returns a string representation of the HouseStark object.
    @Override
    public String toString() {
        return "HouseStark{name='" + name + "', age=" + age + ", role='" + role + "'}";
    }
}