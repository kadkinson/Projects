public class Exam extends Assessment {
    private int pointsEach;     // Number of points each question is worth
    private int numMissed;      // Number of questions missed

    public Exam(int questions, int missed)
    {
        double numericScore;    // Holds calc score

        this.pointsEach = 100 / questions;
        this.numMissed = missed;

        numericScore = 100.0 - (missed * (100.0 / questions));

        this.setScore((int) Math.round(numericScore));
    }

    public int getPointsEach()
    {
        return this.pointsEach;
    }

    public int getNumMissed()
    {
        return this.numMissed;
    }
}
