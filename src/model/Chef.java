package model;

public class Chef extends Person{
    int experience;

    public Chef(int experience) {
        super();
        this.experience = experience;
    }

    public Chef() {
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
