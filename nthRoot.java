class nthRoot{
    public static void main(String[] args) {
        double number=27;
        double root=3;
        double left=0;
        double right=number;
        double middle=0;
        double error=0.01;
        multiply(number,root);
        while((right-left)>error)
        {
            middle=(left+right)/2;
            if(multiply(middle,root)>number)
            {
                right=middle;
            }
            else{
                left=middle;
            }
        }
        System.out.println(middle);

    }
    public static double multiply(double number,double root)
    {
        double multValue=1;
        for (int i=0;i<root;i++)
        {
            multValue=multValue * number;
        }
        return multValue;
    }
}