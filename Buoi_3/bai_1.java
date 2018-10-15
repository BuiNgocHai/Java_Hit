import java.util.Scanner;

public class bai_1{
    private static void nhap(int a[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.printf("a[%d] : ",i+1);
            a[i] = sc.nextInt();
        }
    }
    private static void xuat(int a[],int n){
        System.out.println("Mang la: ");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
    }
    public static void main(String[] args){
        int [] a = new int [1000];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Moi nhap: ");
        n = sc.nextInt();
    
        nhap(a,n);
        xuat(a,n);
    }
}