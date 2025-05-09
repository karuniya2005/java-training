public class recur {
    public static void main(String[] args) {
        welcome(5);
    }
    public static void welcome(int count){
        if (count<1)
        {
            return;
        }
        System.out.println("welcome to sec");
        welcome(count-1);
    }

    
}
