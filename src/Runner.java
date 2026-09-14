import java.util.Scanner;

public class Runner {

    //main
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //instantiate Pet #1 - default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        //instantiate Pet #2 - custom constructor
        Pet pet2 = new Pet("Kash", "Dog", 8);
        System.out.println(pet2);

        //instantiate Pet #3 - user input
        System.out.println("Enter animal type: ");
        String userType = scnr.nextLine();

        System.out.println("Enter animal name: ");
        String userName = scnr.nextLine();

        System.out.println("Enter animal age: ");
        int userAge = Integer.parseInt(scnr.nextLine());

        Pet pet3 = new Pet(userName, userType, userAge);
        System.out.println(pet3);
    }
}
