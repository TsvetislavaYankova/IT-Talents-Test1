package test1_Season13;

public class Task3 {
    /*
    Write a method that by given array of integers checks if the average value of the array
    is positive or negative. The method should return either “Positive”, “Non-positive” as a result
    (zero is non-positive). Use recursion!
     */
    public static void main(String[] args) {
        int[] arr = {-3, 5, 2, 6};
        System.out.println(averageValue(arr, 0, 0));
    }

    static String averageValue(int[] arr, int sum, int i) {
        if (i == arr.length) {
            if ((sum / arr.length) <= 0) {
                return "Non-positive";
            } else {
                return "Positive";
            }
        }
        sum += arr[i];
        return averageValue(arr, sum, i + 1);
    }
}
