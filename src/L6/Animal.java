package L6;

import java.util.Random;

public class Animal {

    protected String species;
    protected String favouriteFood;
    protected Gender gender;
    protected Random random;
    protected String name;

    public Animal (){

        random = new Random(System.currentTimeMillis());
    }

    public String getSpecies(){
        return species;
    }

    public String getFavouriteFood(){
        return favouriteFood;
    }

    public String getName(){
        return name;
    }

    public void setGender(Gender newGender){
        this.gender = newGender;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String toString(){
        return "namn: " + name + ", kön: " + gender.name();
    }

}
