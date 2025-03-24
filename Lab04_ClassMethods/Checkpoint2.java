import java.util.Random;
public class Checkpoint2 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i=1; i<=2; i++) {
            for (int j = 1; j <= 25; j++) {
                System.out.print(random.nextInt(100) + " ");
            }
            System.out.println();
        }
    }
}
