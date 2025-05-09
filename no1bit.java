public class no1bit {
    public static int countOnesBitwise(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(countOnesBitwise(number));  
    }
}