public class Runner {
    public static void main(String[] args) {

        // Instantiate an object to our Tests class using constructor
        Tests myScores = new Tests();
        System.out.println(myScores);

        // Call the getAverage() method
        myScores.getAverage();

        // Print out the class state (that is with the toString() in Tests)
        System.out.println(myScores);
    }
}
