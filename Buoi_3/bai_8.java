import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class bai_8{
    static int [] a = new int[256] ;
    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap: ");
        s = sc.nextLine();
        for (int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(a[i]>0){
                System.out.println((char)i+" "+a[i]);
            }
        }


    }
}