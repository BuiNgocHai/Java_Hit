import java.util.Scanner;
public class bai_8{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long n;
        long t;
        System.out.print("Nhap so tien: ");
        n = sc.nextLong();
        System.out.print("Chia thanh: ");
        //int to[] =new int[11];
        long to[] = {500000,200000,100000,50000,20000,10000,5000,2000,1000};
        for(int i=0;i<11;i++){
            t = n / to[i];
            if(t != 0){
                System.out.printf(" %d to %d",t,to[i]);
            }
            n = n % to[i];
        }
    }
}