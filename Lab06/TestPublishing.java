public class TestPublishing {
    public static void main(String[] args) {
        Publishing publishing = new Publishing();
        Publishing.publication[] publications = new Publishing.publication[10];
        publications[0] = publishing.new publication("General Press", "General Knowledge", 200, 150.00);
        publications[1] = publishing.new publication("WorldPress", "World Facts", 300, 200.00);
        publications[2] = publishing.new megazine("Lifestyle Inc.", "Lifestyle Monthly", 100, 120.75, "Monthly");
        publications[3] = publishing.new megazine("TechUpdates", "Tech Trends", 50, 99.99, "Weekly");
        publications[4] = publishing.new book("CMU Press", "Java for Beginners", 250, 450.50, "John Doe");
        publications[5] = publishing.new book("TechWorld", "Advanced Java", 320, 500.00, "Jane Smith");
        publications[6] = publishing.new book("HistoryBooks", "World History", 400, 300.00, "Alice Walker");
        publications[7] = publishing.new kidsMegazine("KidsWorld", "Fun with Numbers", 80, 80.00, "5-8 years");
        publications[8] = publishing.new kidsMegazine("Junior Reads", "Adventures of Tim", 60, 90.00, "8-12 years");
        publications[9] = publishing.new kidsMegazine("Little Learners", "Learn ABCs", 70, 75.50, "3-5 years");

        // Display all publications
        for (Publishing.publication pub : publications) {
            pub.display();
            System.out.println();
        }
    }
}
