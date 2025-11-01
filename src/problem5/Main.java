package problem5;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book nineteenEightyFour = new Book("1984", "George Orwell", 1949);
        Book cleanCode = new Book("Clean Code", "Robert C. Martin", 2008);

        System.out.println("=== Stack Test ===");
        BookStack stack = new BookStack(new LinkedList<>());
        stack.push(hobbit);
        stack.push(nineteenEightyFour);
        stack.push(cleanCode);
        stack.display();

        Book popped = stack.pop();
        System.out.println("Popped: " + popped);
        System.out.println("Top: " + stack.peek());
        stack.display();

        // === Queue Test ===
        System.out.println("=== Queue Test ===");
        BookQueue queue = new BookQueue(new LinkedList<>());
        queue.enqueue(hobbit);
        queue.enqueue(nineteenEightyFour);
        queue.enqueue(cleanCode);
        queue.display();

        Book dequeued = queue.dequeue();
        System.out.println("Dequeued: " + dequeued);
        System.out.println("Front: " + queue.peek());
        queue.display();
    }
}
