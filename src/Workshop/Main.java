package Workshop;

public class Main {

    public static void main(String[] args){
        // Your task is to get this code to run and
        // print the correct output
        Galaxy milkyWay = createMilkyWay();

        performTests(milkyWay);

    }

    /**
     * This is a method for creating the Milky Way-galaxy.
     * @return
     */
    public static Galaxy createMilkyWay(){

        Galaxy galaxy = new Galaxy("Milky Way");

        Planet[] planets = {new Planet("Mercury", 0.06),
                new Planet("Venus", 0.82),
                new Planet("Earth", 1),
                new Planet("Mars", 0.11),
                new Planet("Jupiter", 317.89),
                new Planet("Saturn", 95.17),
                new Planet("Uranus", 14.56),
                new Planet("Neptune", 17.24)};

        galaxy.createStarsystem("Sol", planets);

        planets = new Planet[3];
        planets[0] = new Planet("Proxima d", 0.260);
        planets[1] = new Planet("Proxima b", 1.055);
        planets[2] = new Planet("Proxima c", 7);

        galaxy.createStarsystem("Proxima Centauri", planets);

        return galaxy;

    }

    /**
     * A method to test your code
     * @param galaxy
     */
    public static void performTests(Galaxy galaxy){
        int passed = 0;
        int failed = 0;
        System.out.println("Testing your code...\n\n");
        // Test case 1, expected result: 446.85
        System.out.println("# Test 1:");
        System.out.println("Testing the calculateMass() method");
        System.out.println("Expected result: 446.85");
        System.out.println("Your result: " + galaxy.getStarsystem("Sol").calculateMass());
        if (galaxy.getStarsystem("Sol").calculateMass() == 446.85){
            System.out.println("Test passed");
            passed++;
        }
        else{
            System.out.println("Test failed");
            failed++;
        }
        // Test case 2, expected result: Proxima Centauri, Proxima d, Proxima b, Proxima c
        System.out.println("\n# Test 2:");
        System.out.println("Testing the getStarSystem and toString methods");
        System.out.println("Expected result: Proxima Centauri, Proxima d, Proxima b, Proxima c");
        System.out.println("Your result: "+ galaxy.getStarsystem("Proxima Centauri"));
        if (galaxy.getStarsystem("Proxima Centauri").toString().equals("Proxima Centauri, Proxima d, Proxima b, Proxima c")){
            System.out.println("Test passed");
            passed++;
        }
        else{
            System.out.println("Test failed");
            failed++;
        }
        // Test case 3, expected output: 0.06
        System.out.println("\n# Test 3:");
        System.out.println("Testing the getPlanet and getMass methods");
        System.out.println("Expected result: 0.06");
        System.out.println("Your result: "+ galaxy.getPlanet("Mercury").getMass());
        if (galaxy.getPlanet("Mercury").getMass() == 0.06){
            System.out.println("Test passed");
            passed++;
        }
        else{
            System.out.println("Test failed");
            failed++;
        }
        // Test case 4, expected output: 0
        System.out.println("\n# Test 4:");
        System.out.println("Testing the setMass method");
        System.out.println("Expected result: 0");
        galaxy.getPlanet("Earth").setMass(0);
        System.out.println("Your result: "+ galaxy.getPlanet("Earth").getMass());
        if (galaxy.getPlanet("Earth").getMass() == 0){
            System.out.println("Test passed");
            passed++;
        }
        else{
            System.out.println("Test failed");
            failed++;
        }
        galaxy.getPlanet("Earth").setMass(1);

        // Test case 5
        System.out.println("\n# Test 5:");
        System.out.println("Testing the addPlanet method");
        galaxy.getStarsystem("Sol").addPlanet("Planet Nine", 4.4);
        System.out.println("Expected result: Sol, Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune, Planet Nine");
        System.out.println("Your result: " + galaxy.getStarsystem("Sol"));
        if (galaxy.getStarsystem("Sol").toString().equals("Sol, Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune, Planet Nine")){
            System.out.println("Test passed");
            passed++;
        }
        else{
            System.out.println("Test failed");
            failed++;
        }

        // Test case 6
        System.out.println("\n# Test 6:");
        System.out.println("Testing the getPlanet method");
        System.out.println("Expected result: null");
        System.out.println("Your result: " + galaxy.getPlanet("Nibiru"));
        if (galaxy.getPlanet("Nibiru") == null){
            System.out.println("Test passed");
            passed++;
        }
        else{
            System.out.println("Test failed");
            failed++;
        }

        // Test case 7
        System.out.println("\n# Test 7:");
        System.out.println("Testing the getStarsystem method");
        System.out.println("Expected result: null");
        System.out.println("Your result: " + galaxy.getStarsystem("White Sun"));
        if (galaxy.getStarsystem("White Sun") == null){
            System.out.println("Test passed");
            passed++;
        }
        else{
            System.out.println("Test failed");
            failed++;
        }


        System.out.println("\nNumber of tests passed: " + passed);
        if (failed == 0){
            System.out.println("Present your solution");
        }
    }


}
