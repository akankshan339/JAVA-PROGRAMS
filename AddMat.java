import java.util.*;

public class AddMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col, i, j;
        System.out.println("NAME: Akanksha Negi \nUNIVERSITY ROLL NO: 2218256 \nSEMESTER: 04 \nROLL NO:04");
        System.out.println("Enter no of rows:");
        row = sc.nextInt();
        System.out.println("Enter no of columns:");
        col = sc.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int sum[][] = new int[row][col];
        System.out.println("Enter the matrix 1 elements :");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the matrix 2 elements :");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }

        }
        System.out.println("The sum of 2 matrix are ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
