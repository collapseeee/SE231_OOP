import java.util.Scanner;
public class CheckpointThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        //Print the results:
        for (int k=0; k<4; k++) {
            System.out.println("Sum of the elements at column " + k + " is " + sumColumn(matrix, k));
        }
        input.close();
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i=0; i<m.length; i++) {
            sum+=m[i][columnIndex];
        }
        return sum;
    }
}
