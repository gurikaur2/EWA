/* Write a program to depict “two people one bank account” problem and How Ryan and Monica end up with inconsistent amount leading to concurrency issues and how you can solve this issue using the synchronized block/keyword.

Definition of Done:

Create two thread objects namely Ryan and Monica either by extending Thread class or implementing Runnable interface
You can ask the user to enter the initial amount and perform the desired operation inside run()
Show the desired result 

use synchronization*/
class RyanandMonica
{
    private double balance=100;

    public bankAccount(double balance)
    {
        this.balance=balance;
    }
    void depositAmount(int amount)
    {
        balance+=amount;
    }
    double withdrawAmount(int amount)
    {
        if(balance<amount)
        {
            System.out.println("Insufficient Balance");
            return balance;
        }
        balance-=amount;
        return balance;
    }

    synchronized void displayBalance()
    {
        System.out.println("Current Balance: "+balance);
    }
    
}

class RyanandMonica extend Thread
{
    private String threadName;
    private bankAccount account;
    private double amount;

    public RyanandMonica(String threadName, bankAccount account, double amount)
    {
        this.threadName=threadName;
        this.account=account;
        this.amount=amount;
    }

    @Override
    public void run()
    {
        synchronized(account)
        {
            System.out.println(threadName+" is trying to withdraw "+amount);
            double newBalance=account.withdrawAmount((int)amount);
            System.out.println(threadName+" completed the withdrawal. New Balance: "+newBalance);
            account.displayBalance();
        }
    }
}