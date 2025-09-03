public class ThreadDemo {
    public static void main(String[] args) {
        int [] arr={5,3,8,1,2};
        System.out.println("Element at index 2:" + arr[2]);

        //get the name of the current thread 
        String threadName = Thread.currentThread().getName();
        System.out.println("Current thread:" + threadName);

        //get reference to main thread
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread: "+ mainThread);

        mainThread.setName("John");
        System.out.println("After name change:" + mainThread);


        try {
            mainThread.sleep(5000); //sleep for 5 seconds
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Main thread interrupted");
        }

    }
}
