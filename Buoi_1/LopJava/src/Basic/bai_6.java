/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author Vicker
 */
import java.util.Scanner;
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
