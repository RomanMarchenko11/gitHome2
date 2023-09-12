package reflection;

public class Persona extends SuperPersona implements PersonaInterface {
    private String name;
    private String surName;
    private int passportID;

    public Persona(String name, String surName, int passportID) {
        this.name = name;
        this.surName = surName;
        this.passportID = passportID;
    }

    public Persona(String name) {
        this.name = name;
    }

    public Persona() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPassportID() {
        return passportID;
    }

    public void setPassportID(int passportID) {
        this.passportID = passportID;
    }
}
