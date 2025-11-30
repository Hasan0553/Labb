package L6;

import java.util.Random;

public class Zoo {

    private Random random;

    private Animal[] animals;
    private Lion[] pride;
    private Crow[] murder;

    public Zoo(){
        random = new Random(System.currentTimeMillis());
        // Initialize all arrays
        animals = new Animal[2];
        createPride(4);
        createMurder(4);
    }

    private void createMurder(int number){
        // Fyll på med kod här
        for(int i = 0; i < number -1; i++){
            murder[i] = new Crow();
        }
    }

    private void createPride(int number){
        // Fyll på med kod här
    }

    public void addLionToPride(Lion newLion){
        // Fyll på med kod här
    }

    public void addCrowToMurder(Crow newCrow){
        // Fyll på med kod här
    }

    public void printAllAnimals(){
        // Skriv ut alla djur
        for (Animal animal: animals){
            System.out.print(animal + " ");
        }
        System.out.println();
        for (Lion lion: pride){
            System.out.print(lion + " ");
        }
        System.out.println();
        for (Crow crow: murder){
            System.out.print(crow + " ");
        }
    }

}
