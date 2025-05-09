public class findcharinstring {
    public static void main(String[] args) {
        String s1="hello";
        String s2="helllo";
        char result=0;
        String concat=s1+s2;
        char[] chars=concat.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            result=(char)(result^chars[i]);
        }
        System.out.println("Odd one is "+result);

    }
}
