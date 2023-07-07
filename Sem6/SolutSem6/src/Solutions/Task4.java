package Solutions;

import java.util.HashSet;
import java.util.Objects;

public class Task4 {
    private String name;
    private int age;
    private String breed;

    public Task4(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task4 cat = (Task4) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Breed: " + breed;
    }

    public static void main() {
        HashSet<Task4> catSet = new HashSet<>();

        Task4 cat1 = new Task4("Mittens", 3, "Maine Coon");
        Task4 cat2 = new Task4("Whiskers", 5, "Persian");
        Task4 cat3 = new Task4("Mittens", 3, "Maine Coon"); // Дубликат cat1

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);

        System.out.println("Размер множества: " + catSet.size());
        System.out.println("Содержимое множества:");
        for (Task4 cat : catSet) {
            System.out.println(cat);
        }
    }
}