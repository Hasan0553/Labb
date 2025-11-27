package L6;

public enum Gender {

    MALE("♂"),
    FEMALE("♀"),
    OTHER("\uD83D\uDF21");

    String symbol;

    Gender(String symbol){
        this.symbol = symbol;
    }

    public String toString(){
        return symbol;
    }

}
