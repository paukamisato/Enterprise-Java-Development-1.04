import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();

        System.out.println("===Exercise1===");
        int[] numbers = {2, 5, 8, 6, 3};
        System.out.println("Numbers input: " + Arrays.toString(numbers));
        int difference = exercises.largestAndSmallest( numbers );
        System.out.println("The difference between the largest and smallest values is: "+ difference);

        System.out.println("===Exercise2===");
        int[] numbers1 = {10, 1, 6, 4, 9};
        System.out.println("Numbers input: " + Arrays.toString(numbers1));
        String twoSmallest = exercises.twoSmallest(numbers1);
        System.out.println(twoSmallest);

        System.out.println("===Exercise3===");
        double x = 2;
        double y = 3;
        double result = exercises.equation( x, y );
        System.out.println("The result is: " +result);
    }
}
