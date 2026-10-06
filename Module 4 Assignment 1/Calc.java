public class Calc {

    private double num1;
    private double num2;

    //default constructor
    public Calc() {
        this.setNum1(0.0);
        this.setNum2(0.0);
    }

    //get method
    public double getNum1() {
        return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    //set method
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //calculator method
    public double add() {
        return this.getNum1() + this.getNum2();
    }

    public double subtract() {
        return this.getNum1() - this.getNum2();
    }

    public double multiply() {
        return this.getNum1() * this.getNum2();
    }

    public double divide() {
        return this.getNum1() / this.getNum2();
    }

    public String toString() {
        String output = "Displaying private data fields using toString():\n";
        output += "Num1: " + this.getNum1() + "\n";
        output += "Num2: " + this.getNum2();
        return output;
    }
}
