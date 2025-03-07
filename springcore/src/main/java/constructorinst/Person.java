package constructorinst;

public class Person {
    private String name;
    private int personID;

    public Person(String name, int personID) {
        this.name = name;
        this.personID = personID;
    }

    @Override
    public String toString() {
        return this.name+" : "+this.personID;
    }

    

    
    

}

    