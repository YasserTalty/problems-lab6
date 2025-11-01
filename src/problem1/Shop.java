package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";

        while (keepShopping.equalsIgnoreCase("y")) {
            System.out.print("Enter the name of the item: ");
            String itemName = scan.nextLine();

            System.out.print("Enter the unit price: ");
            double itemPrice = scan.nextDouble();

            System.out.print("Enter the quantity: ");
            int quantity = scan.nextInt();

            // consume leftover newline
            scan.nextLine();

            // create a new item and add it to the cart
            Item item = new Item(itemName, itemPrice, quantity);
            cart.add(item);

            // print the cart contents and total
            double totalPrice = 0.0;
            System.out.println("\nShopping Cart:");
            System.out.println("------------------------------------------------------");
            System.out.println("Item\t\t\tPrice\tQty\tTotal");
            System.out.println("------------------------------------------------------");

            for (Item i : cart) {
                System.out.println(i.toString());
                totalPrice += i.getPrice() * i.getQuantity();
            }

            System.out.println("------------------------------------------------------");
            System.out.printf("Grand Total: $%.2f\n\n", totalPrice);

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
            System.out.println();
        }

        System.out.println("Thank you for shopping!");
        scan.close();
    }
}
