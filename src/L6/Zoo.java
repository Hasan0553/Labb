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
        murder = new Crow[number];
        for(int i = 0; i < number; i++){
            murder[i] = new Crow();
            // denna måste vara först för För varje varv i loopen behöver du:
            // skapa en ny kråka

            // tilldela den kön

            // tilldela den namn

            // gå vidare till nästa kråka


            Gender randomGender = Gender.values()[random.nextInt(Gender.values().length)];
            murder[i].setGender(randomGender);        //Sätter könet på kråkan på plats i till det slumpade könet


            BirdName randomName = BirdName.values()[random.nextInt(BirdName.values().length)];
            murder[i].setName(String.valueOf(randomName));
        }
    }

    private void createPride(int number){
        // Fyll på med kod här

        pride = new Lion[number];
        for(int i = 0; i < number; i++){
            pride[i] = new Lion();


            Gender randomGender = Gender.values()[random.nextInt(Gender.values().length)];
            pride[i].setGender(randomGender);        //Sätter könet på Lion på plats i till det slumpade könet


            LionName randomName = LionName.values()[random.nextInt(LionName.values().length)];
            pride[i].setName(String.valueOf(randomName));

    }

    public void addLionToPride(Lion newLion){
        // Fyll på med kod här
            for (i = 0; i < pride.length; i++)
                if (i != null) {
                    Lion lion = newLion();
                }
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
