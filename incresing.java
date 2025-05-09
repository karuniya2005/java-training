public class incresing {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               if(arr[i]<arr[j])
               {
                 flag+=1;
               }
            }

        }
        if (flag==0)
        {
            System.out.println("decresing");
        }
        else
        {
            System.out.println("incresing");
        }

    }
    
}
