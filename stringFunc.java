import java.util.Scanner;
public class stringFunc {
    public static void main(String[] args) {
        System.out.println("NAME: Akanksha Negi \nUNIVERSITY ROLL NO: 2218256 \nSEMESTER: 04 \nROLL NO:04");
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter String 1:");
        str1 = sc.nextLine();

        System.out.println("Enter String 2:");
        str2 = sc.nextLine();
       
        int len = str1.length();
        System.out.println("Length of String 1 is: " + len);
        
        String concStr = str1.concat(str2);
        System.out.println("Concatenated String: " + concStr);

        String repStr = str1.replace('A', 'S');
        System.out.println("String after replacing 'A' with 'S': " + repStr);

        repStr = repStr.replaceAll("a", "java");
        System.out.println("String after replacing all 'a' with 'java': " + repStr);

        System.out.println("After trimming String 2: " + str2.trim());
        sc.close();
    }
}
