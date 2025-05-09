public class arrsumrec {
    
    public static int sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = sum(numbers, numbers.length);
        System.out.println("Sum of array elements: " + result);
    }
}