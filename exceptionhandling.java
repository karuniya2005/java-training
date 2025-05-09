public class exceptionhandling {
    public static void main(String[] args) {
        int n1=6;
        int n2=2;
        int div;
        try{
            div=n1/n2;
            System.out.println(div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("don't divide by zero");
        }
        finally{
            System.out.println("Finally code be excuted");
        }
        
    }
    
}
