package L3Uppgift1;

public class Dog {
    private int age;
    private String gender;
    private String name;
// Dessa ovan är attributer
// public är default konstruktor
    
    public void Dog(){

    }


    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }


    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name + " " + gender + " " + age ;
    }
}

