import java.util.Scanner;
public class bai_6{
    public static void main(String[] args){
        long n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap: ");
        n = sc.nextLong();
        boolean[] check = new boolean[10000+1];
        for(int i=2;i<=10000;i++){
            check[i]=true;
        }
        for(int i=2;i<=10000;i++){
            if(check[i] == true){
                for(int j=2*i;j<=10000;j+=i){
                    check[j]=false;
                }
            }
        }
        for(int i=2;i<=10000;i++){
            if(check[i]==true){
                if((long)(Math.pow((double)2, (double)(i-1))*(Math.pow((double)2,(double) i)-1)) > n){
                    break;
                }
                else{
                System.out.print(" "+(long)(Math.pow((double)2, (double)(i-1))*(Math.pow((double)2,(double) i)-1)));
                }
            }
        }
    }
}