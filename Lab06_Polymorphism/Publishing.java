public class Publishing {
    public class publication {
        private String publisher;
        private int numberOfPages;
        private double price;
        private String title;
        public publication(String publisher, String title, int numberOfPages, double price) {
            this.publisher = publisher;
            this.title = title;
            this.numberOfPages = numberOfPages;
            this.price = price;
        }
        public void display() {
            System.out.println("The " + publisher + " publishs " + title + ", " + numberOfPages + " pages, " + price + " Bahts.");
        }
    }

    class megazine extends publication {
        private String publicationUnit;
        public megazine(String publisher, String title, int numberOfPages, double price, String publicationUnit) {
            super(publisher, title, numberOfPages, price);
            this.publicationUnit = publicationUnit;
        }
        @Override
        public void display() {
            super.display();
            System.out.println("This megazine is " + publicationUnit + " print.");
        }
    }

    class book extends publication {
        private String author;
        public book(String publisher, String title, int numberOfPages, double price, String author) {
            super(publisher, title, numberOfPages, price);
            this.author = author;
        }
        @Override
        public void display() {
            super.display();
            System.out.println("This book has written by " + author + ".");
        }
    }

    class kidsMegazine extends publication {
        private String ageRange;
        public kidsMegazine(String publisher, String title, int numberOfPages, double price, String ageRange) {
            super(publisher, title, numberOfPages, price);
            this.ageRange = ageRange;
        }
        @Override
        public void display() {
            super.display();
            System.out.println("This book is recommended for age range " + ageRange + ".");
        }
    }
}