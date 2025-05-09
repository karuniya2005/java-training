public class complent {
    public static void main(String[] args) {
        int inp=10;
        int mask=0;
        int compliment= ~inp;
        while(mask<inp)
        {
            mask=(mask<<1)|1;
        } 
        compliment=compliment&mask;
        System.out.println(compliment);



    }

}
