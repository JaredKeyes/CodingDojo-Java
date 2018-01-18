import java.util.ArrayList;

public class BasicJava {
    public String loop(int number) {
        for ( int i = 1; i <= number; i++) {
            System.out.println(i);
            }
        return "Done.";
    }
    public String oddLoop(int number) {
        for ( int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        return "Done.";
    }
    public String sumOf(int number) {
        int sum = 0;
        for ( int i = 0; i <= number; i++) {
            System.out.println("New number: " + i);
            sum = sum + i;
            System.out.println("Sum: " + sum);
        }
        return "Done.";
    }
    public String iterate(int[] array) {
        for ( int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
        }
        return "Done.";
    }
    public String findMax(int[] array) {
        int max = array[0];
        for ( int i = 0; i < array.length; i++) {
            if ( array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        return "Done.";
    }
    public String average(int[] array) {
        int sum = 0;
        for ( int i= 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int average = sum/array.length;
        System.out.println(average);
        return "Done.";
    }
    public String oddArray(int number) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for ( int i = 0; i<= number; i++) {
            if ( i % 2 != 0){
                myArray.add(i);
            }
        }
        System.out.println(myArray);
        return "Done.";
    }
    public String greaterThanY(int number, int[] array) {
        int sum = 0;
        for ( int i = 0; i < array.length; i++) {
            if ( array[i] > number) {
                sum = sum+1;
            }
        }
        System.out.println(sum);
        return "Done.";
    }
    // public String square() {
    //     ArrayList<Integer> squareArray = new ArrayList<Integer>();
    //     squareArray.add(1);
    //     squareArray.add(2);
    //     squareArray.add(4);
    //     squareArray.add(8);
    //     for ( int i = 0; i < Array.length; i++) {
    //         Array[i] = Array[i] * Array[i];
    //     }
    //     System.out.println(squareArray);
    //     return "Done.";
    // }
}
