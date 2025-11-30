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
        int adjustedProwess = random.nextInt(0,100);
        if (adjustedProwess < prowess && prey.equals(getFavouriteFood())){
            this.prowess += 10;
            return true;
        }
        return false;
    }

    public void setName(String newName){
        for (int i = 0; i < LionName.values().length; i++) {
            if(LionName.values()[i].name().equals(newName)){
                this.name = newName;
                return;
            }


        }

    }
}
