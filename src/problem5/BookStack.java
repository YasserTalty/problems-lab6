package problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack(LinkedList<Book> stack) {
        this.stack = new LinkedList<>();
        this.stack.addAll(stack);
    }

    public void push(Book book) {
        if(!this.stack.contains(book)) {
            this.stack.add(book);
        }
    }

    public Book pop() {
        // code here and don't to test if it's empty
        return this.stack.removeFirst();
    }

    public Book peek() {
        return this.stack.getFirst();// code here and don't to test if it's empty
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for (Book book : stack) {
            System.out.println("  " + book);
        }

    }
}

