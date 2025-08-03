import java.util.LinkedList;

public class SupportQueue {
    private LinkedList<String> queue = new LinkedList<>();

    // 1. Add customer to end of queue
    public void addCustomer(String name) {
        queue.addLast(name);
    }

    // 2. Serve customer (remove from front)
    public String serveCustomer() {
        if (!queue.isEmpty()) {
            return queue.pollFirst();
        } else {
            return null;
        }
    }

    // 3. Peek next customer (without removing)
    public String peekNextCustomer() {
        if (!queue.isEmpty()) {
            return queue.peekFirst();
        } else {
            return null;
        }
    }

    // 4. Print current queue
    public void printQueue() {
        System.out.println("Current Queue: " + queue);
    }

    // 5. Re-add dropped customer at end
    public void reAddCustomerToEnd(String name) {
        queue.addLast(name);
        System.out.println(name + " re-added to end of queue.");
    }

    // 6. (Bonus) Prioritize customer (move to front)
    public void prioritizeCustomer(String name) {
        if (queue.remove(name)) {
            queue.addFirst(name);
            System.out.println(name + " moved to front of queue.");
        } else {
            System.out.println(name + " not found in queue.");
        }
    }

    public static void main(String[] args) {
        SupportQueue sq = new SupportQueue();
        // Manually add 5–6 customers
        sq.addCustomer("Alice");
        sq.addCustomer("Bob");
        sq.addCustomer("Charlie");
        sq.addCustomer("Diana");
        sq.addCustomer("Eve");
        sq.addCustomer("Frank");

        sq.printQueue();

        // Serve 2 customers
        System.out.println("Served: " + sq.serveCustomer());
        System.out.println("Served: " + sq.serveCustomer());
        sq.printQueue();

        // Peek next customer
        System.out.println("Next in line: " + sq.peekNextCustomer());

        // Re-add a dropped customer
        sq.reAddCustomerToEnd("Alice");
        sq.printQueue();

        // Bonus: Prioritize a customer
        sq.prioritizeCustomer("Eve");
        sq.printQueue();
    }
}
