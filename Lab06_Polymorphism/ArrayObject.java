import java.util.ArrayList;
import java.util.Date;
public class ArrayObject {
    public static void main(String[] args) {
        // Create an ArrayList.
        ArrayList<Object> list = new ArrayList<>();
        // Create objects.
        Object loan = new Object();
        String string = "ABC";
        Date date = new Date();
        Object circle = new Object();

        // Add objects to the ArrayList.
        list.add(loan);
        list.add(string);
        list.add(date);
        list.add(circle);

        // Display the objects.
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}