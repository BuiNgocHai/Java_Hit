import java.util.Scanner;

public class Hocsinh{
    public String masv;
    public String tensv;
    public int namsinh;
    public float DiemToan;
    public float DiemVan;
    public float DiemAnh;

    Scanner sc = new Scanner(System.in);

    public void nhaphs(){
        System.out.println("Nhap thong tin sinh vien: \n");
        System.out.print("Nhap masv: ");
        this.masv = sc.nextLine();
        System.out.print("Nhap ten sv: ");
        this.tensv = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namsinh = sc.nextInt();
        System.out.print("Nhap Diem Toan: ");
        this.DiemToan = sc.nextFloat();
        System.out.print("Nhap Diem Van: ");
        this.DiemVan = sc.nextFloat();
        System.out.print("Nhap Diem Anh: ");
        this.DiemAnh = sc.nextFloat();
    }

    public void noiten(){
        System.out.println("Ten la: " + this.tensv);
    }

    public void noituoi(){
        System.out.println("Tuoi la: " + (2018-this.namsinh));
    }
    
    public float Diemtb(){
        return (this.DiemToan + this.DiemVan + this.DiemAnh)/3;
    }

    public void xuatThongtin(){
        System.out.println("Thong tin sinh vien: \n");
        System.out.println("Masv: " + this.masv);
        System.out.println("Ten sv: "+ this.tensv);
        System.out.print("Nam sinh: " + this.namsinh);
        System.out.print("Diem Toan: " + this.DiemToan);
        System.out.print("Diem Van: "+this.DiemVan);
        System.out.print("Diem Anh: " + this.DiemAnh);
    
    }

    
}