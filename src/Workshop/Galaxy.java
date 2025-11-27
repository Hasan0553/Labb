package Workshop;

public class Galaxy {

    private String name;
    private Starsystem[] starsystems;

    public Galaxy(String name){
        this.name = name;
        this.starsystems = new Starsystem[5];
    }

    public String getName(){
        return this.name;
    }

    public Planet getPlanet(String planetName){
        for (int i=0 ; i < starsystems.length; i++){
            if (starsystems[i] != null){
                if (starsystems[i].getPlanets(planetName) != null) {
                    return starsystems[i].getPlanets(planetName);
                }
            }
        }
        return null;
    }

    public Starsystem getStarsystem(String systemName) {
        for (int i=0 ; i < starsystems.length; i++){
            if (starsystems[i] != null){
                if(starsystems[i].getName().equals(systemName)) {
                    return starsystems[i];
                }
            }
        }
        return null;

    }

    public void createStarsystem(String starName, Planet[] planets){
        Starsystem newSystem = new Starsystem(starName, planets);

        for (int i = 0; i < starsystems.length; i++){
            if (starsystems[i] == null){
                starsystems[i] = newSystem;
                return;
            }
        }
        Starsystem[] newArray = new Starsystem[planets.length + 5];
        for (int i = 0; i < starsystems.length; i++){
            newArray[i] = starsystems[i];
        }
        newArray[starsystems.length] = newSystem; // lägger till i de nya arrayen som har utökats
        starsystems = newArray; // byter ut gamla arrayen

    }

    public String toString(){
        return name;
    }


}
