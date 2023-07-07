package Solutions;

public class Task3 {
    private String name;
    private int age;
    private String breed;

    public Task3(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Breed: " + breed;
    }

    public static void main() {
        Task3 cat1 = new Task3("Mittens", 3, "Maine Coon");
        Task3 cat2 = new Task3("Whiskers", 5, "Persian");

        System.out.println(cat1);
        System.out.println(cat2);
    }
}