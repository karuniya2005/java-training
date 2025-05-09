public class string {
    public static void main(String[] args) {
        String name="Ramesh";
        String employee="Ramesh";
        System.out.println(name==employee);
        String tenant=new String ("Ramesh");
        System.out.println(name==tenant);
        System.out.println("shallow "+(name==tenant));
        System.out.println("deeps "+name.equals(tenant) );
        // string bulider
        StringBuilder builder=new StringBuilder("Numbers are:");
        builder.append(""+1);
        System.out.println( builder);
        StringBuilder builders=new StringBuilder("Numbers are:");
        for(int i=1;i<20;i++) 
        {
            builders.append(""+1);

        }
        System.out.println( builders);
        

    }
    
}
