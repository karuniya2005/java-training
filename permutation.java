public class permutation {
    public static void main(String[] args) {
        String input="abc";
        ArrayList<String> result
    }
    public static void permutation(String str,String prem, ArrayList<String> result){
        if(str.isEmpty())
            result.add(prem);
        for (int i=0;i<str.length();i++)
        {
            String curr=""+str.charAt(i);
            String remainingStr=str.substring(0,i)+str.substring(i+1);
            permutation(remainingStr,prem+curr,result);
        }   
    }
    
}
