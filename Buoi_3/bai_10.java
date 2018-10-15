import java.util.Scanner;

public class bai_10{
    public static void main(String[] args){
        int n,m;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap xau: ");
        s = sc.nextLine();
        System.out.print("Nhap kich thuoc: ");
        n = sc.nextInt();
        m = sc.nextInt();
        char [][] mt = new char [m][n];
        int k=0;
        int i=0,j=0;
        int l=0,t=0,r=n,b=m;
        int flag=1;
        while (k!=m*n){
            if (k>= s.length()){
                mt[i][j] ='.';
            }
            else
            mt[i][j] =s.charAt(k);
            k++;
            if (flag==1) {
                if (j!=r-1) j++;
                else {
                    flag=2;
                    i++;
                    r--;
                }
            }
            else if (flag==2){
                if (i!=b-1) i++;
                else {
                    flag=3;
                    j--;
                    b--;
                }
            }
            else if (flag==3){
                if (j!=l) j--;
                else {
                    flag=4;
                    i--;
                    l++;
                }
            }
            else {
                if (i!=t+1) i--;
                else {
                    flag=1;
                    j++;
                    i=++t;
                }
            }
        }
        for (i=0;i<m;i++){
            for ( j=0;j<n;j++){
                System.out.print(mt[i][j]+" ");
            }
            System.out.println();
    }
}
}