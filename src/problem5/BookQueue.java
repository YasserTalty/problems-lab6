package problem5;

import java.util.LinkedList;
public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue(LinkedList<Book> queue) {
        this.queue = new LinkedList<>();
        this.queue.addAll(queue);
    }
    public void enqueue(Book book) {
        if(!this.queue.contains(book)) {
            this.queue.addLast(book);
        }
    }
    public Book dequeue() {
        // code here and don't to test if it's empty
        return this.queue.removeFirst();
    }
    public Book peek() {
        return this.queue.getFirst();// code here and don't to test if it's empty
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue contents (front to back):");
        for (Book book : queue) {
            System.out.println("  " + book);
        }

    }
}
