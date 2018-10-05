import java.util.Scanner;

public class bai_7{
    private static float tinh(int n){
        float res =0;
        for(int i=1;i<=n;i++){
            res+= (float)1/i;
        }
        return res;
    }
    public static void main(String[] args){
        int n;
        System.out.print("Moi nhap: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n%2==0){
            System.out.print("Ket qua: "+tinh(n));
        }
        else{
            System.out.print("Ket qua: "+ Math.sqrt((float)(n-1)));
        }
    }
}