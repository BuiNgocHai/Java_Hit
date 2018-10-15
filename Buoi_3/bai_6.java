import java.util.Scanner;

public class bai_6{
    static void nhap(int a[][],int n,int m){
        System.out.println("Nhap mang: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    static void tinh(int a[][],int b[][],int c[][],int ca,int ha ,int hb ){
        for(int i=0;i<ca;i++){
            for(int j=0;j<hb;j++){
                c[i][j]=0;
                for(int z=0;z<ha;z++){
                    c[i][j]+=a[i][z]*b[z][j];
                }
            }
        }
        System.out.println("Ket qua: ");
        for(int i=0;i<ca;i++){
            for(int j=0;j<hb;j++){
                System.out.printf("%d ",c[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int ca,ha,cb,hb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang a: ");
        ca = sc.nextInt();
        ha = sc.nextInt();
        System.out.print("Nhap kich thuoc mang b: ");
        cb = sc.nextInt();
        hb = sc.nextInt();
        if (ha!=cb){
            System.out.print("Mang khong hop le!");
        }
        else{
        int [][] a = new int [ca+2][ha+2];
        int [][] b = new int [cb+2][hb+2];
        int [][] c = new int [ca+cb][ha+hb];
        nhap(a,ca,ha);
        nhap(b,cb,hb);
        tinh(a,b,c,ca,ha,hb);
    }
}
}