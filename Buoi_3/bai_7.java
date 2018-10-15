import java.util.Scanner;

public class bai_7{
    public static void main(String[] args){
        String s;
        System.out.print("Moi nhap: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("Chuoi la: "+s);
        System.out.println("Do dai: "+ s.length());
    }
}