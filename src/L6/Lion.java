package L6;

public class Lion extends Animal{

    private int prowess;

    public Lion(){
        super.favouriteFood = "antelope";
        super.species = "lion";
        this.prowess = random.nextInt(0,100);
    }

    public void setProwess(int newProwess){
        if (newProwess > 0 && newProwess <= 100){
            this.prowess = newProwess;
        }
    }

    public boolean hunt(String prey){
        return
    }
}
