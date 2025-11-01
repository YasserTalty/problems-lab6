package problem3;

import java.util.Scanner;

public class TestLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter library capacity: ");
        int n = sc.nextInt();
        Library lib = new Library(n);

        lib.add(new Novel("The Alchemist", "Paulo Coelho", 197, 15.5));
        lib.add(new Dictionary("Oxford Dictionary", "English"));

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Document");
            System.out.println("2. Display Documents");
            System.out.println("3. Delete Document");
            System.out.println("4. Find Document by Number");
            System.out.println("5. Display Authors");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter document type (novel/textbook/magazine/dictionary): ");
                    String type = sc.nextLine().toLowerCase();
                    switch (type) {
                        case "novel" -> {
                            System.out.print("Title: "); String t = sc.nextLine();
                            System.out.print("Author: "); String a = sc.nextLine();
                            System.out.print("Pages: "); int p = sc.nextInt();
                            System.out.print("Price: "); double pr = sc.nextDouble();
                            lib.add(new Novel(t, a, p, pr));
                        }
                        case "textbook" -> {
                            System.out.print("Title: "); String t = sc.nextLine();
                            System.out.print("Author: "); String a = sc.nextLine();
                            System.out.print("Pages: "); int p = sc.nextInt(); sc.nextLine();
                            System.out.print("Level: "); String l = sc.nextLine();
                            lib.add(new TextBook(t, a, p, l));
                        }
                        case "magazine" -> {
                            System.out.print("Title: "); String t = sc.nextLine();
                            System.out.print("Month: "); String m = sc.nextLine();
                            System.out.print("Year: "); int y = sc.nextInt();
                            lib.add(new Magazine(t, m, y));
                        }
                        case "dictionary" -> {
                            System.out.print("Title: "); String t = sc.nextLine();
                            System.out.print("Language: "); String lang = sc.nextLine();
                            lib.add(new Dictionary(t, lang));
                        }
                        default -> System.out.println("Unknown type!");
                    }
                }
                case 2 -> lib.displayDocuments();
                case 3 -> {
                    System.out.print("Enter document number to delete: ");
                    int num = sc.nextInt();
                    Document d = lib.document(num);
                    if (d != null && lib.delete(d)) System.out.println("Deleted successfully.");
                    else System.out.println("Document not found.");
                }
                case 4 -> {
                    System.out.print("Enter document number: ");
                    int num = sc.nextInt();
                    Document d = lib.document(num);
                    System.out.println(d != null ? d : "Document not found.");
                }
                case 5 -> lib.displayAuthors();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}

