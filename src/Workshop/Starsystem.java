package Workshop;

public class Starsystem {

    private String name;
    private Planet[] planets;

    public Starsystem (){
        this("Unknown", new Planet[5]);


    }

    public Starsystem (String name){
        this.name = name;
        this.planets = new Planet[5];

    }

    public Starsystem (String name, Planet[] planets){
        this.name = name;
        this.planets = planets;
    }

    public String getName(){
        return this.name;
    }

    public double calculateMass(){
        double totalMass = 0.0;
        for(int i=0; i<planets.length;i++){
            if (planets[i] != null){
                totalMass += planets[i].getMass();
            }
        }
        return totalMass;
    }

    public Planet getPlanets(String planetName) {
        for (int i=0; i < planets.length; i++){
            if (planets[i] != null){
                if (planets[i].getName().equals(planetName)) {
                    return planets[i];
                }
            }
        }
        return null;
    }

    public void addPlanet(String planetName, double planetMass){
        Planet newPlanet = new Planet(planetName, planetMass);

        for (int i = 0; i < planets.length; i++){
            if (planets[i] == null){
                planets[i] = newPlanet;
                return;
            }
        }
        Planet[] newArray = new Planet[planets.length + 5];
        for (int i = 0; i < planets.length; i++){
            newArray[i] = planets[i];
        }
        newArray[planets.length] = newPlanet;
        planets = newArray;

    }


    public String toString() {
        String result = name;
        for (int i = 0; i < planets.length; i++) {
            if (planets[i] != null) {
                result += ", " + planets[i].getName();
            }
        }
        return result;
    }
}


