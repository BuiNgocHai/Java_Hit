import java.util.Scanner;

public class bai_4{
    private static boolean check(int n){
        return Math.sqrt((float)n)== (int)Math.sqrt((float)n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Moi nhap: ");
        n = sc.nextInt();
        for (int i=1;i<n;i++){
            if(check(i)){
                System.out.printf("%d ",i);
            }
        }
    }
}