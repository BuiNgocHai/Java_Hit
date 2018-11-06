import java.util.Scanner;
import java.util.ArrayList;

public class Quanly{
    static Scanner sc = new Scanner(System.in);
    static public ArrayList<Lophoc> DanhSachLop = new ArrayList<Lophoc>();

    public static void themLop(){
        
        Lophoc L = new Lophoc();
        L.nhaplop();
        DanhSachLop.add(L);

    }

    public static void xoaLop(){
        System.out.print("Nhap ma lop: ");
        String malop ;
        malop = sc.nextLine();
        for(int i = 0 ; i < DanhSachLop.size(); i++){
            if(DanhSachLop.get(i).MaLop == malop){
                DanhSachLop.remove(i);
            }
        }

       // DanhSachLop.remove(i);
    }

    public static void tongAllsv(){
        int sum = 0;
        for(int i = 0 ; i < DanhSachLop.size() ; i++ ){
            sum += DanhSachLop.get(i).Sosv();
        }
        System.out.print("Tong so sinh vien trong toan bo lop: " + sum);

    }

    public static void tongtbAllsv(){
        int sum1 = 0, sum2 =0 ;
        for(int i = 0 ; i < DanhSachLop.size() ; i++ ){
            sum1 += DanhSachLop.get(i).Sosv();
            sum2 += DanhSachLop.get(i).Tongdiem();
        }
        System.out.print("Tong so sinh vien trong toan bo lop: " + sum2/sum1);

    }
    public static void xuat(){
        for(int i=0;i<DanhSachLop.size();i++){
            System.out.println("Thong tin lop " + (i+1));
            DanhSachLop.get(i).xuatLop();
        }

    }

    public static void main(String[] args){
        int n;
        System.out.print("Nhap so luong lop: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin lop thu " + i+1);
            themLop();
            System.out.println("Nhap so luong hoc sinh: ");
            int k = sc.nextInt();
            for(int j=0;j<k;j++){
                DanhSachLop.get(i).DanhsachHS.get(j).nhaphs();
            }
        }
        xuat();
        tongAllsv();
        tongtbAllsv();
    }

}