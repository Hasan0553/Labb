package L6;

public class Main {

    public static void main(String[] args){
        Zoo zoo = new Zoo();

        // Hur koden nedanför fungerar kommer vi att gå igenom
        // under föreläsning F8 eller F9.
        try {
            zoo.printAllAnimals();
        }
        catch (NullPointerException e){
            System.out.println("You haven't initialized all the arrays containing animals.");
        }


    }
}
