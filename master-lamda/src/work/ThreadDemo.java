package work;

public class ThreadDemo {
    public static void main(String[] args) {

        //First Thread: Thread - JOHN

        Runnable thread1 =()->{
            // this is body of the thread
            //stuff
            for(int i=0;i<=10;i++)
            {
                System.out.println("Value of i is "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();
    }
}
