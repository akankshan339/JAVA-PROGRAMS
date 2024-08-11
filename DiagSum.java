import java.util.Scanner;
public class DiagSum {
    public static void main(String[] args) {
        System.out.println("NAME: Akanksha Negi \nUNIVERSITY ROLL NO: 2218256 \nSEMESTER: 04 \nROLL NO:04");
        Scanner sc = new Scanner(System.in);
        int row, col, i, j , ltSum=0 , rtSum=0;
        System.out.println("Enter no of rows:");
        row = sc.nextInt();
        System.out.println("Enter no of columns:");
        col = sc.nextInt();
        int mat[][] = new int[row][col];       
        System.out.println("Enter the matrix  elements :");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
               if(i == j)
                ltSum=ltSum + mat[i][j];

              if(i+j == row-1)
                rtSum=rtSum + mat[i][j];
            }
        }
        System.out.println("Sum of left Diagonal elements "+ltSum);
        System.out.println("Sum of right Diagonal elements "+rtSum);
    }
}
