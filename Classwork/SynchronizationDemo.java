public class SynchronizationDemo {
    private String threadName;
    private CounterDemo counter;

    //default constructor 
    /* public SynchronizationDemo()
    {
        this.threadName = Thread.currentThread().getName();
        this.counter= new CounterDemo();
    } */

    //parameterised constructor
    public SynchronizationDemo(String threadName, CounterDemo counter)
    {
        this.threadName = threadName;
        this.counter = counter;
    }

    //overriden run method from Thread class
    @Override
    {
        public void run()
        {
            //perform some task here
            for (int i = 1; i <=5; i++) {
                //increment the count in synchronized manner
                synchronized (counter) {
                    counter.incrementCount();
                    System.out.println(this.threadName + " increment count to: " + counter.getCount());
                }
            }
        }
    }
}
