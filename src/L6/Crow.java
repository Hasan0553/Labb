package L6;

public class Crow extends Animal {

    private int intelligence;

    public Crow(){
        super.favouriteFood = "carrion";
        super.species = "crow";
        this.intelligence = random.nextInt(25, 50);
    }

    public boolean solveProblem(int difficulty){
        int adjustedDifficulty = random.nextInt(-5, 5);
        difficulty += adjustedDifficulty;

        if (intelligence > difficulty){
            return true;
        }
        return false;
    }
}
