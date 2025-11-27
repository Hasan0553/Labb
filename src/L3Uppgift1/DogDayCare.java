package L3Uppgift1;

import java.util.Scanner;
public class DogDayCare {
    private int costForOneDog = 350;
    private DogOwner dogOwner;

    public DogDayCare(){
    memberRegistrstion();
    }


    private void addDog(Dog dog, int number){
    Scanner input = new Scanner(System.in);
    System.out.println("Name of dog " + number + ": ");
    String nameDog = input.nextLine();
    System.out.println(nameDog);

    System.out.println(("Gender of dog " + number + "M or F? "));
    String gender = input.nextLine();
    System.out.println(gender);

    System.out.println("Age of dog " + number + ": ");
    int age = input.nextInt();
    System.out.println(age);

    dog.setName(nameDog);
    dog.setGender(gender);
    dog.setAge(age);
        System.out.println(dog.toString());

    }

    private int calculateCost(DogOwner dogowner) {
        return dogowner.getNumberOfDogs() *  costForOneDog;
    }

    private void memberRegistrstion(){
        Scanner input = new Scanner(System.in);
        System.out.println("Your name please: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + "!");

        System.out.println("Your adress: ");
        String adress = input.nextLine();
        System.out.println("Your adress is " + adress);

        System.out.println("Do you have 1 or 2 dogs: ");
        int numberOfDogs = input.nextInt();
        System.out.println(numberOfDogs);

        dogOwner = new DogOwner(name, adress, numberOfDogs);
        addDog(dogOwner.getDogOne(),1);
            if (numberOfDogs > 1){
                addDog(dogOwner.getDogTwo(), 2);

            }

        printDogOwnerStats(dogOwner);
    }

    private void printDogOwnerStats(DogOwner dogOwner){
        this.dogOwner = dogOwner;
        System.out.println(dogOwner);
        System.out.println(calculateCost(dogOwner));

    }

}