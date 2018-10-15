import java.util.Scanner;
public class bai_5{
    public static void main(String[] args){
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap kich thuoc: ");
        n = sc.nextInt();
        m = sc.nextInt();
        int [][] a = new int[n+3][m+3];
        int [][] b = new int[n+3][m+3];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("a[%d][%d]: ",i+1,j+1);
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][n-1-i] =a[i][j];
            }
        }
        System.out.println("Mang a:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Mang sau khi dao: ");
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d ",b[i][j]);
            }
            System.out.println();
        }

    }

}