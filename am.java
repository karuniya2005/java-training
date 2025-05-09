public class am {
    public static void main(String[] args) {
        int n = 1634;
        int m = n;
        int b = 0;
        while (n > 0) {
            int a = n % 10;
            b = b + (int) Math.pow(a, 5);
            n = n / 10;
        }
        if (m == b) {
            System.out.println("amstrong");
        } else {
            System.out.println("not amstrong");
        }

    }

}
