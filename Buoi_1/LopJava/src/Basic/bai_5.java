
package Basic;

import java.util.Scanner;

public class bai_5 {
     public static void main(String[] args){
        int n1,n2;
        String s1,s2,s3="---------------------";
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        s1 = sc.nextLine();
        System.out.print("Nhap Tuoi: ");
        n1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten: ");
        s2 = sc.nextLine();
        System.out.print("Nhap Tuoi: ");
        n2 = sc.nextInt();
        System.out.printf("%s \n%-15s%-10s \n%s \n",s3,"Ten","Tuoi",s3);
        System.out.printf("%-15s%-10d \n%-15s%-10d\n",s1,n1,s2,n2);
    }
    
}
