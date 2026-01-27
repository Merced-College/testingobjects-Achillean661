/*
Ryan Lee
1-27-26
LAB: Testing Objects
*/

public class DogTest {

    // Primary 
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println("Printing dog1 directly:");
        System.out.println("name = " + dog1.getName() + " , age = " + dog1.getAge() + ", breed = " + dog1.getBreed());
        System.out.println(dog1);

        Dog dog2 = new Dog("Bob", 4, "Collie");
        System.out.println("Printing dog2 directly:");
        System.out.println("name = " + dog2.getName() + " , age = " + dog2.getAge() + ", breed = " + dog2.getBreed());
        System.out.println(dog2);

    }
}