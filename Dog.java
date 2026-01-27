/*
Ryan Lee
1-27-26
LAB: Testing Objects
*/

public class Dog {

    // Attributes of Dog.
    private String name;
    private int age;
    private String breed;

    // Default Constructor.
    public Dog() {
        name = "Unknown";
        age = 0;
        breed = "Mixed";
    }

    // Parameterized Constructor.
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Setters and Getters for name, age, and breed.

    // Sets name.
    public void setName(String name) {
        this.name = name;
    }

    // Sets age.
    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("Error");
    }

    // Sets breed.
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Gets name.
    public String getName() {
        return name;
    } 

    // Gets age.
    public int getAge() {
        return age;
    }

    // Gets breed.
    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{name = '" + name + "', age = '" + age + "', breed = '" + breed + "'}";
    } 
}