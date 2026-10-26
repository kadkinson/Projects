public class Pet {
    //private data fields
    private int age;
    private String name;
    private String type;

    //public Constructors
    public Pet(){
        this.setName("Pet Name");
        this.setType("Animal");
        this.setAge(1);
    }
    public Pet(String newName, String newType, int newAge) {
        this.setName(newName);
        this.setType(newType);
        this.setAge(newAge);
    }

    //public set or mutator method for every private data field (except when the data field is read-only)
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setType(String newType) {
        this.type = newType;
    }

    //public get or accessor method for every private data field (except if it is a secret)
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }

    //public custom method
    public String speak() {
        if (this.type.equalsIgnoreCase("Dog")) {
            return "Woof";
        } else if (this.type.equalsIgnoreCase("Cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    //public toString method that prints out all of the object state (meaning the data in the object instance that you will later instantiate in the main() method)
    public String toString() {
        String output = "Pet information: \n";
        output += "Type: " + this.getType() + "\n";
        output += "Name: " + this.getName() + "\n";
        output += "Sound: " + this.speak() + "\n";
        output += "Age: " + this.getAge() + "\n";
        return output;
    }
}
