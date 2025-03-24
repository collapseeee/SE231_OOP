package KeyValueStorageComparisonInterface;

import java.util.Dictionary;
import java.util.Hashtable;

public class StudentRecordsDictionary {

    public static void main(String[] args) {
        Dictionary<Integer, String> studentRecords = new Hashtable<>();
        studentRecords.put(123, "Alice");
        String name = studentRecords.get(123);
        System.out.println("Student with ID 123: " + name);
    }
}

