public class CheckpointOne {
    public static void main(String[] args) {
        int total = 0;
        for (int i=1; i<=30; i++) {
            int deposit = 1;
            for (int j=1; j<i; j++) {
                deposit*=2;
            }
            total+=deposit;
            System.out.println("day " + i + " deposit " + deposit + " total is " + total);
        }
    }
}