import java.util.Scanner;

public class bai_2{
    private static void nhap(){
        int n,k,x,z;
        int [] a = new int[10000];
        System.out.print("Nhap so phan tu mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("a[%d] : ",i+1);
            a[i] = sc.nextInt();
        }
        System.out.print("Nhap phan tu muon xoa: ");
        x = sc.nextInt();
        System.out.print("Nhap phan tu muon them: ");
        z = sc.nextInt();
        System.out.print("Nhap phan vi tri muon them: ");
        k = sc.nextInt();
        xoa(a,n,x,z,k);
    }
    private static void xoa(int a[],int n,int x,int z,int k){
        for(int i=0;i<n;i++){
            if(a[i]==x){
                for(int j=i;j<n;j++){
                    a[j]=a[j+1];
                }
                n--;
                i--;
            }
        }
        them(a,n,z,k);
    }
    private static void them(int a[],int n,int z,int k){
        for(int i=n;i>k;i--){
            a[i] =a[i-1];
        }
        a[k] = z;
        n++;
        xuat(a,n);
    }
    private static void xuat(int a[],int n){
        System.out.print("Mang la: ");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
        
    }
    public static void main(String[] args){
      
         nhap();

    }
}