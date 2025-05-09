public class sumofno {
    public static void main(String[] args) {
        int n=5;
        int sum=sumofno(n);
        System.out.println(sum);
        
    }
    public static int sumofno(int n) 
    {
        if (n==1)
        {
            return 1;
        }
        return n+(sumofno(n-1));
        
    }
    
}
