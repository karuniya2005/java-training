import java.util.ArrayList;
public class genparen {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String>list=new ArrayList<>();
        generate(list, n, "", 0, 0);;
        System.out.println(list);  
    }
    public static void generate(ArrayList<String>list,int n,String str,int open,int close)
    {
        if(str.length()==2*n)
        {
            list.add(str);
            return;
        }
        if(open<n)
        {
            generate(list, n, str+"{", open+1, close);
        }
        if(close<open)
        {
            generate(list, n, str+"}", open, close+1);
        }
    }
    
}
