import java.util.Scanner;

public class bai_3{
    public static void main(String[] args){
        float a;
        System.out.print("Nhap so kWH: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        if (a<=50){
            System.out.printf("So tien la: %f",a*1.484);
        }
        else if(a<=100){
            System.out.printf("So tien la: %f",a*1.533);
        }
        else if(a<=200){
            System.out.printf("So tien la: %f",a*1.786);
        }
        else if(a<=300){
            System.out.printf("So tien la: %f",a*2.242);
        }
        else if(a<=400){
            System.out.printf("So tien la: %f",a*2.503);
        }
        else {
            System.out.printf("So tien la: %f",a*2.587);
        }
    }
}