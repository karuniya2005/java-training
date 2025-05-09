import java.util.ArrayList;
public class ip {
    public static void main(String[] args) {
        String input="101023";
        ArrayList<String>list=new ArrayList<>();
        String addr = " ";
        int start=0;
        int segments=0;
        restore(list,input,addr, segments,start);
        System.out.println(list);
    }

    private static void restore(ArrayList<String> list, String input, String addr, int segments, int start) {
        if(segments>=4)
        {
            if(start==input.length())
                list.add(addr);
            return;
        }
        for(int i=start;i<input.length();i++)
        {
            String current=input.substring(start,i+1);
            if(isValid(current))
            {
                restore(list,input,addr+current+".",segments+1,i+1);

            }
        }
    }

    private static boolean isValid(String current) {
        if(
            current.isEmpty() ||
            current.length() > 3 ||Integer.parseInt(current)>255||
            (current.startsWith("0")&& current.length()>1))
            {
                return false;
            }
        return true;
    }

 
}
