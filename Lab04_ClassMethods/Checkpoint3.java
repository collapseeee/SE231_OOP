import java.util.Random;
public class Checkpoint3 {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(21) + 20;
        double sinr = Math.sin(r);
        double cosr = Math.cos(r);
        double tanr = Math.tan(r);
        System.out.println("The sine of " + r + " is " + sinr);
        System.out.println("The cosine of " + r + " is " + cosr);
        System.out.println("The tangent of " + r + " is " + tanr);
    }
}
