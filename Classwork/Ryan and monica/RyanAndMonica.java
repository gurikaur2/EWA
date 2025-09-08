// import java.util.*;
public class RyanAndMonica extends BankAccount {
    BankAccount account = new BankAccount();
    public RyanAndMonica(String name, int amount)
    {
        this.nameThread= name;
        this.amount= amount;

    
    }

    @Override
    public void run()
    {
        //check the balance
        for(int i=0; i<5 ; i++)
        {
            int balance = account.getBalance();
            if (balance>amount) {
                System.out.println(this.nameThread + "is going to withdraw");
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    // TODO: handle exception
                    throw new RuntimeException(e);

                }
                account.withdraw(amount);
                System.out.println(this.nameThread + "completed the withdraw");

            }
            else{
                System.out.println("Sorry, not enough balance for "+ this.nameThread);
            }
        }
       
        

        }
    }

