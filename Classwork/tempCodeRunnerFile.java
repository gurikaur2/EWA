public class DriverClass {
    public static void main(String[] args) {
       Thread mainThread= Thread.currentThread();
       System.out.println("Main thread starts: "+mainThread);

       MyThread childThread1 = new MyThread();
       childThread1.start(); //start the child thread

       System.out.println("Main Thread ends: "+mainThread);
    }
}
