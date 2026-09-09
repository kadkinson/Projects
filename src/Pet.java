public class Pet {
    //private data fields
    private String name;

    //public Constructor(s)
    public Pet(){
        this.setName("");
    }

    //public set or mutator method for every private data field (except when the data field is read-only)
    public void setName(String newName){
        this.name = newName;
    }

    //public get or accessor method for every private data field (except if it is a secret)
    public String getName(){
        return this.name;
    }

    //public toString method that prints out all of the object state (meaning the data in the object instance that you will later instantiate in the main() method)
    public String toString(){
        String output = "Pet information: \n";
        output += "Name: " + this.getName();
        return output;
    }

    //main
    public static void main(String[] args){

        //instantiate Pet
        Pet myPet1 = new Pet();
        myPet1.setName("Kash");
        System.out.println(myPet1.toString());

        Pet myPet2 = new Pet();
        myPet2.setName("Rocky");
        System.out.println(myPet2.toString());
    }
}
