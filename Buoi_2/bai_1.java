import java.util.Arrays;
import java.util.Scanner;

public class bai_1{

    public static void main(String[] args){
        int [] a = new int[5];
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap: ");
        for(int i=1;i<=4;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
       
        System.out.printf("Min thu nhi la: %d ",a[2]);
        
    }
}