import java.util.Scanner;

public class bai_4{
    public static void main(String[] args ){
        int n,m;
        System.out.print("Moi nhap kich thuoc mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int [][] a = new int [n+3][m+3];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("a[%d][%d]: ",i+1,j+1);
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mang la: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
    }

}