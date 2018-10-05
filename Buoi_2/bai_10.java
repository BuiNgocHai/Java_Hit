import java.util.Scanner;
public class bai_10{
    public static void main(String[] args){
        int n;
        System.out.print("Moi nhap: ");
        Scanner sc= new Scanner(System.in);
        n =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j >= (n-1-i)&& j<=(n-1+i))
                    System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}