public class threaddemo extends Thread {
    public static void main(String[] args) {
        threaddemo thread=new threaddemo();
        thread.start();
        threaddemo thread2=new threaddemo();
        thread2.start();
        threaddemo thread3=new threaddemo();
        thread3.start();
    }
    @override
    public void run()
    {
        for (int i=0;i<20;i++)
            {
                System.out.println(i);

            }
        }
        
    }
    
