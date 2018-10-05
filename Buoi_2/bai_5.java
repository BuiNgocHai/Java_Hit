import java.util.Scanner;

public class bai_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Moi nhap: ");
        n = sc.nextInt();
        boolean[] check = new boolean[n+1];
        for(int i=2;i<n;i++){
            check[i]=true;
        }
        for(int i=2;i<n;i++){
            if(check[i] == true){
                for(int j=2*i;j<=n;j+=i){
                    check[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(check[i]==true){
                System.out.printf("%d ",i);
            }
        }


    }
}