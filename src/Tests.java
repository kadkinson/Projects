public class Tests {
    public static void main(String[] args)
    {
        //create/declare variable for 3 test scores
        double testScore1 = 75.3;
        double testScore2 = 96.5;
        double testScore3 = 67.2;
        //calculate average of test scores
        //what is the formula? (a + b + c) / 3
        double average = (testScore1 + testScore2 + testScore3) / 3;
        //display 3 test scores and their average
        System.out.println("Test score 1: " + testScore1);
        System.out.println("Test score 2: " + testScore2);
        System.out.println("Test score 3: " + testScore3);
        System.out.println("The average of 3 test scores is: " + average);
    }
}
