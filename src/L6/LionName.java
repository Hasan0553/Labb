package L6;

public enum LionName {

    BUTCH("Butch"),
    LINK("Link"),
    KYA("Kya"),
    MARA("Mara"),
    KITTY("Kitty"),
    KARISHMA("Karishma"),
    SABAL("Sabal"),
    ZOE("Zoe"),
    SABRINA("Sabrina"),
    ANNIE("Annie"),
    NESSIE("Nessie"),
    ASPEN("Aspen"),
    CHRIS("Chris"),
    LASH("Lash"),
    DIATA("Diata"),
    SMOKEY("Smokey"),
    BATHSEBA("Bathseba"),
    GREG("Greg"),
    ROCCO("Rocco"),
    KING("King"),
    SIMBA("Simba");

    private final String name;

    LionName(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

}
