package L6;
public enum BirdName {
    // This enum contains allowed animal names
    VANTA("Vanta"),
    OBSID("Obsid"),
    CHAR("Char"),
    MURK("Murk"),
    ZYLO("Zylo"),
    AETHER("Aether"),
    NOCTURNE("Nocturne"),
    GLIM("Glim"),
    DAGGER("Dagger"),
    INKO("Inko"),
    SCREE("Scree"),
    VOLT("Volt"),
    FROST("Frost"),
    THISTLE("Thistle"),
    QUAVER("Quaver"),
    BRISK("Brisk"),
    ROOK("Rook"),
    SABLEYE("Sableye"),
    SHRIKE("Shrike"),
    SHADE("Shade");

    private final String name;

    BirdName(String name){
        this.name = name;
    }
    public String toString(){
        return this.name;
    }
}
