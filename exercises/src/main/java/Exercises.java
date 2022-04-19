public class Exercises {
    public int largestAndSmallest(int[] numbers){
        int largestValue = numbers[0];
        int smallestValue = numbers[0];

        if (numbers.length < 2){
            System.out.println( "Invalid Input" );
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestValue) {
                largestValue = numbers[i];
            } else if (numbers[i] < smallestValue) {
                smallestValue = numbers[i];
            }
        }
        return (largestValue - smallestValue);
    }

    public String twoSmallest(int[] numbers){
        String result = "";
        int secondSmallest = Integer.MAX_VALUE;
        int smallestValue = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallestValue) {
                secondSmallest = smallestValue;
                smallestValue = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallestValue){
                secondSmallest = numbers[i];
            }
        }
        result = "The smallest element is " + smallestValue + " and second Smallest element is " +secondSmallest;
        return result;
    }

    public double equation(double x, double y){
        double result = Math.pow(x,2)+Math.pow((((4*y)/5)-x), 2);
        return result;
    }
}
