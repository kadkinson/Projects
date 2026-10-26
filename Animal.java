public class Animal {

    private String species;

    //Default constructor
    public Animal() {
        this.setSpecies("");
    }

    //Custom constructor
    public Animal(String newSpecies) {
        this.setSpecies(newSpecies);
    }

    //Setter
    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    //Getter
    public String getSpecies() {
        return this.species;
    }

    public String toString() {
        return "Species: " + this.getSpecies();
    }
}
