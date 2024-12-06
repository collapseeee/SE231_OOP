public class CheckpointTwo {
    public static void main(String[] args) {
        int total = 0;
        int day = 1;
        int saving = 1;
        while(total<1e6) {
            total+=saving;
            saving*=2;
            System.out.println("day " + day + " Vader total saving " + total);
            day++;
        }
        System.out.println("Number of days is " + (day-1) + " days." );
    }
}