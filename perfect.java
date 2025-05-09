class perfect {
    public static void main(String[] args) {
        int number = 28;
        int div = 0;
        for (int i = 1; i < number; i += 1) {
            if (number % i == 0) {
                System.out.println(i);
                div += i;
            }
        }
        System.out.println(div);
        if (number == div) {
            System.out.println("perfect number");
        } else {
            System.out.println("not perfect");
        }

    }
}