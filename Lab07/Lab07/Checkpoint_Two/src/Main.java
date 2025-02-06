import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LibraryItem[] resources = new LibraryItem[3];

        for (int i = 0; i < resources.length; i++) {
            System.out.print("Enter the book title: ");
            String title = input.nextLine();
            System.out.print("Enter the borrower name: ");
            String borrowerName = input.nextLine();
            resources[i] = new Resources.Book(title, borrowerName);
        }

        // Result:
        for (LibraryItem l : resources) {
            System.out.println("Barcode: " + l.getBarcode() + ", Title: " + l.getTitle() + ", Loan Period: " + l.getLoanPeriod() + " days.");
            l.checkout(l.getBorrowerName());
        }

    }
}