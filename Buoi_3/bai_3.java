import java.util.Scanner;

public class bai_3{
    static void nhap(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap: ");
        n = sc.nextInt();
        int [] a = new int[n+2];
        for(int i=0;i<n;i++){
            System.out.printf("a[%d]: ",a[i]);
            a[i] = sc.nextInt();
        }
        int j;
        for(int i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if( (a[i]%2 == 1) && (a[j]%2==0) ){
                    int tg= a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
                if(a[i]%2 == 0 && a[i]>a[j]){
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
                if(a[i]%2 ==1 && a[i]<a[j]){
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] =tg;
                }
            }
        }
        xuat(a,n);
    }
    static void xuat(int a[],int n){
        System.out.print("Mang la: ");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
    }
        public static void main(String[] args){
        nhap();
    }
}