class cube {
    public static void main(String[] args) {
        double x = 27;
        double guess = x / 3.0;
        double preguess;
        do {
            preguess = guess;
            guess = (2.0 * guess + x / (guess * guess)) / 3.0;
        } while (guess != preguess);
        System.out.println(guess);

    }

}
