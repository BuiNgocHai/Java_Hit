import java.util.Scanner;

public class bai_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.print("Moi nhap diem: ");
        a = sc.nextFloat();
        while(a>10||a<0){
            System.out.print("Moi nhap lai: ");
            a=sc.nextFloat();
        }
        if(a>=8.5){
            System.out.print("Loai A");
        }
        else if(a>=7.5){
            System.out.print("Loai B");
        }
        else if(a>=6){
            System.out.print("Loai C");
        }
        else if (a >= 4){
            System.out.print("Loai D");
        }
        else {
            System.out.print("Loai F");
        }
    }
}