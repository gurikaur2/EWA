
import java.time.chrono.ThaiBuddhistChronology;

//java threads using thread class

class MyThread extends Thread {
    
    public String threadName;

    public MyThread()
    {
    //default constructor
    this.threadName = Thread.currentThread().getName();
    }

    //parameterized constructor
    public MyThread(String threadName)
    {
        this.threadName = threadName;
    }
    

    
    
    
    //overridden run method from Thread class
    @Override
    public void run()
    {
        //perform some task
        for (int i =1; i<=5 ; i++)
        {
            //generate some random number from 1 to 100
            int randomNum = (int)(Math.random()*100 +1);
            System.out.println("Random number:"+i+": "+randomNum);

            try {
                Thread.sleep(5000); //sleep for 5 sec
            } catch (InterruptedException e) {
               System.out.println("Child thread interrupted.");

            }
        }
        System.out.println("Child thread finished execution.");
    }
}
