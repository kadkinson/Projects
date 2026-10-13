//this class is a blueprint for a simple calculator
//it holds two numbers (double) and exposes the following methods:
//add, subtract, multiply, divide
//it also provides safe input: getValidNumber keeps asking until a number is entered
import java.util.Scanner;
public class Calc {
    //private data fields
    private double num1;
    private double num2;

    //default constructor
    public Calc() {
        this.setNum1(0.0);
        this.setNum2(0.0);}

    //get methods
    public double getNum1() {
        return this.num1;}

    public double getNum2() {
        return this.num2;}

    //set methods
    public void setNum1(double num1) {
        this.num1 = num1;}

    public void setNum2(double num2) {
        this.num2 = num2;}

    //safe input
    public double getValidNumber(Scanner scnr, String prompt) {
        double number = 0.0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            String input = scnr.nextLine().trim();
            if (input.matches("[-+]?(\\d+\\.?\\d*|\\.\\d+)")) {
                number = Double.parseDouble(input);
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return number;
    }

    //calculator methods
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

    //toString displays the private data fields
    public String toString() {
        String output = "Displaying private data fields using toString():\n";
        output += "Num1: " + this.getNum1() + "\n";
        output += "Num2: " + this.getNum2();
        return output;
    }
}
