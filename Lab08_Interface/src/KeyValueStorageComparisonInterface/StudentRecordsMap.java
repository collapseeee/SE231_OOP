package KeyValueStorageComparisonInterface;

import java.util.HashMap;
import java.util.Map;

public class StudentRecordsMap {

    public static void main(String[] args) {
        Map<Integer, String> studentRecords = new HashMap<>();
        studentRecords.put(123, "Alice");
        if (studentRecords.containsKey(789)) {
            System.out.println("Student with ID 789 exists");
        } else {
            System.out.println("Student with ID 789 does not exist");
        }
    }
}
