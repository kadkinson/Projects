import java.util.Scanner;
public class Tests {

    // Fields
    private double ave;
    private int count;
    private int score;

    // Constructor
    public Tests() {
        this.ave = 0;
        this.count = 0;
        this.score = 0;
    }

    // Read only accessors
    public double getAve() {
        return this.ave;
    }

    public int getCount() {
        return this.count;
    }

    // Score has getter and setter
    public int getScore() {
        return this.score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }

    // Read test scores from user, computes average,
    // and stores the results into this.ave and this.count
    public void getAverage() {
        Scanner scnr = new Scanner(System.in);

        int sum = 0;
        int scoreCount = 0;

        System.out.print("Please enter test scores (type -1 to quit): ");
        int testScore = scnr.nextInt();

        while (testScore != -1) {
            sum += testScore;
            scoreCount++;
            System.out.print("Please enter test scores (type -1 to quit): ");
            testScore = scnr.nextInt();
        }

        this.count = scoreCount;
        this.ave = (double) sum / this.count;
    }

    @Override
    public String toString() {
        String output = "The average of the " + this.getCount() + " scores entered is "
                + String.format("%.2f", this.getAve()) + ".";
        return output;
    }
}
