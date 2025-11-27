package L3Uppgift1;

public class DogOwner {
    private String adress;
    private String name;
    private int numberOfDogs;
    private Dog dogOne;
    private Dog dogTwo;

    public DogOwner(String name, String adress, int numberOfDogs){
        this.name = name;
        this.adress = adress;
        this.numberOfDogs = numberOfDogs;
        dogOne = new Dog();
        if (numberOfDogs > 1){
            dogTwo = new Dog();
        }
    }

    public String getAdress(){
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Dog getDogOne(){
        return this.dogOne;
    }

    public Dog getDogTwo(){
        return this.dogTwo;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfDogs(){
        return this.numberOfDogs;
    }

    public String toString(){
        return "DogOwner{" +
                "adress='"+ adress + '\'' +
                ", name ='" + name + '\'' +
                ", numberOfDog=" + numberOfDogs +
                ", dogOne=" + dogOne +
                ", dogTwo=" + dogTwo +
                '}';
    }

}

