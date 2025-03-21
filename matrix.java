import java.util.Scanner;

public class matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        
        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Choose operation: 1.Addition, 2.Multiplication, 3.Transpose");
        int f = sc.nextInt();
        
        switch (f) {
            case 1:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
                System.out.println("Matrix Addition Result:");
                break;
                
            case 2:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        c[i][j] = 0;
                        for (int g = 0; g < 2; g++) {
                            c[i][j] += a[i][g] * b[g][j];
                        }
                    }
                }
                System.out.println("Matrix Multiplication Result:");
                break;
                
            case 3:
                System.out.println("Transpose of First Matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        c[i][j] = a[j][i];
                    }
                }
                break;
                
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}