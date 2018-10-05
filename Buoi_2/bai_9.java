import java.util.Scanner;
public class bai_9{
    private static int GCD(int a,int b){
        if (a==0||b==0) 
            return 0;
        while(a!=b){
            if(a>b)
                a= a-b;
            if(b>a)
                b= b-a;
        }
        return a;
    }
    public static void main(String[] args){
        int a,b;
        System.out.print("Moi nhap: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();
        System.out.print("Uoc Chung Nho Nhat La: "+GCD(a,b));
        System.out.println("\nBoi Chung Nhat La: "+(int)((Math.abs((double)a)* Math.abs((double)b) )/GCD(a,b)));

    }
}