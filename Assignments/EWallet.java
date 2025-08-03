import java.util.ArrayList;

class EWallet {
    private ArrayList<Double> wallet = new ArrayList<>();

    // 1. Add a transaction
    public void addTransaction(double amount) {
        wallet.add(amount);
    }

    // 2. Get total spent
    public double getTotalSpent() {
        double sum = 0;
        for (double amount : wallet) {
            sum += amount;
        }
        return sum;
    }

    // 3. Get largest transaction
    public double getLargestTransaction() {
        if (wallet.isEmpty()) return 0;
        double max = wallet.get(0);
        for (double amount : wallet) {
            if (amount > max) max = amount;
        }
        return max;
    }

    // 4. Print all transactions
    public void printAllTransactions() {
        System.out.println("All Transactions:");
        for (double amount : wallet) {
            System.out.println(amount);
        }
    }

    // 5. Print transactions above a threshold
    public void printAboveThreshold(double threshold) {
        System.out.println("Transactions above " + threshold + ":");
        for (double amount : wallet) {
            if (amount > threshold) {
                System.out.println(amount);
            }
        }
    }

    // 6. Refund last transaction
    public void refundLastTransaction() {
        if (!wallet.isEmpty()) {
            double removed = wallet.remove(wallet.size() - 1);
            System.out.println("Refunded last transaction: " + removed);
        } else {
            System.out.println("No transactions to refund.");
        }
        printAllTransactions();
    }

    public static void main(String[] args) {
        EWallet myWallet = new EWallet();
        // 10 sample transactions
        myWallet.addTransaction(100.0);
        myWallet.addTransaction(250.5);
        myWallet.addTransaction(600.0);
        myWallet.addTransaction(50.0);
        myWallet.addTransaction(1200.0);
        myWallet.addTransaction(75.5);
        myWallet.addTransaction(900.0);
        myWallet.addTransaction(30.0);
        myWallet.addTransaction(500.0);
        myWallet.addTransaction(800.0);

        myWallet.printAllTransactions();
        System.out.println("Total Spent: " + myWallet.getTotalSpent());
        System.out.println("Largest Transaction: " + myWallet.getLargestTransaction());

        myWallet.printAboveThreshold(500.0);

        myWallet.refundLastTransaction();
    }
}
