import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fName, lName, email, SID;
        double score;
        Student student = new Student();
        System.out.print("Enter First name: ");
        fName = input.nextLine();
        student.setFirstName(fName);
        System.out.print("Enter Last name: ");
        lName = input.nextLine();
        student.setLastName(lName);
        System.out.print("Enter email: ");
        email = input.nextLine();
        student.setEmail(email);
        System.out.print("Enter ID: ");
        SID = input.nextLine();
        student.setID(SID);
        System.out.print("Enter score: ");
        score = input.nextInt();
        student.setScore(score);
        System.out.println(" " + student.toString());
    }
}
