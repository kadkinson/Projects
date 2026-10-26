import java.util.Arrays;
import java.util.Random;

public class IntArray {
    // private data fields
    private int length;
    private int myArray[];

    // Constructor: allocates an array with l elements
    public IntArray(int l) {
        length = l;
        myArray = new int[length];
    }

    // Deletes the values and the elements
    public void clear() {
        length = 0;
        myArray = new int[0];
    }

    // Fills every element with a random integer from 1 to 6
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    // Returns the value at the given index
    public int get(int element) {
        return myArray[element];
    }

    // Stores a new value at the given index
    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    // Returns the number of elements
    public int size() {
        return length;
    }

    // True if the array has no elements
    public boolean isEmpty() {
        return length == 0;
    }

    // Sorts smallest to largest
    public void sort() {
        Arrays.sort(myArray);
    }

    // One line per element, with a header
    @Override
    public String toString() {
        String result = "IntArray instance data:\n";
        for (int i = 0; i < length; i++) {
            result += "Element " + i + ":" + myArray[i] + "\n";
        }
        return result;
    }
}
