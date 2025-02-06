import java.util.Random;
import java.util.Date;

public class Resources {
    static Date date = new Date();
    static Random random = new Random();
    public static String random4DigitsNum() {
        return String.format("%04d", random.nextInt(10000));
    }

    public static class Book extends LibraryItem {
        public Book(String title, String name) {
            super(title, name);
            loanPeriod = 21;
        }
        @Override
        public String getBarcode() {
            return "B" + random4DigitsNum();
        }
        public String getTitle() {
            return this.title;
        }
        public int getLoanPeriod() {
            return this.loanPeriod;
        }
        public void checkout(String borrowerName) {
            System.out.println(borrowerName + "is checkout " + this.title + ". (" + date.toString() + ")");
        }
    }

    public static class Audiobook extends LibraryItem {
        public Audiobook(String title, String name) {
            super(title, name);
            loanPeriod = 14;
        }
        @Override
        public String getBarcode() {
            return "A" + random4DigitsNum();
        }
        public String getTitle() {
            return this.title;
        }
        public int getLoanPeriod() {
            return this.loanPeriod;
        }
        public void checkout(String borrowerName) {
            System.out.println(borrowerName + "is checkout " + this.title + ". (" + date.toString() + ")");
        }
    }
    public static class DVD extends LibraryItem {
        public DVD(String title, String name) {
            super(title, name);
            loanPeriod = 7;
        }
        @Override
        public String getBarcode() {
            return "D" + random4DigitsNum();
        }
        public String getTitle() {
            return this.title;
        }
        public int getLoanPeriod() {
            return this.loanPeriod;
        }
        public void checkout(String borrowerName) {
            System.out.println(borrowerName + " is checking out " + this.title + ". ( at" + date.toString() + ")");
        }
    }
}
