public class factrecur {
    public static void main(String[] args) {
        int num=5;
        int factorial=fact(num);
        System.out.println(factorial);

    }
    public static int fact(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    
}
