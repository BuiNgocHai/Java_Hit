import java.util.Scanner;
//import java.lang.Math;
public class bai_6 {
    public static void main(String[] args){
        float n;
        System.out.print("Nhap duong kinh: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextFloat();
        System.out.printf("Chu vi hinh tron la: %f",Math.PI*Math.pow(n, 2));
        System.out.printf("\nThe tich hinh cau: %f\n",Math.PI*Math.pow(n, 3)* (float)3/4);
        
    }
    
}