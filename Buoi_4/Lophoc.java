import java.util.Scanner;
import java.util.ArrayList;
public class Lophoc{
    Scanner sc = new Scanner(System.in);
    public String TenLop, MaLop, LopTruong, maLopTruong;
    public ArrayList<Hocsinh> DanhsachHS = new ArrayList<Hocsinh>();

    public int Sosv(){
        return DanhsachHS.size();
    }

    public String LopTruong(){
        System.out.print("Nhap ma hoc sinh lop truong: ");
        this.maLopTruong = sc.nextLine();
        int index1 = this.DanhsachHS.indexOf(this.maLopTruong);
        return this.DanhsachHS.get(index1).tensv;
    }

    public int TinhHStrenTB(){
        
        int sum = 0;
        for(int i=0;i<DanhsachHS.size();i++){
            if(DanhsachHS.get(i).Diemtb() > 5){
                sum++;
            }
        }
        return sum;
    }

    public String Tenmax(){
        float max1 = 0 ;
        String tensv="";
        for(int i = 0 ; i < DanhsachHS.size(); i++){
            if(this.DanhsachHS.get(i).Diemtb() > max1 ){
                max1 = this.DanhsachHS.get(i).Diemtb();
                tensv = this.DanhsachHS.get(i).tensv;
            }
        }
        return tensv;
    }

    public String Tenmin(){
        float min1 = 10 ;
        String tensv="";
        for(int i = 0 ; i < DanhsachHS.size(); i++){
            if(this.DanhsachHS.get(i).Diemtb() < min1 ){
                min1 = this.DanhsachHS.get(i).Diemtb();
                tensv = this.DanhsachHS.get(i).tensv;
            }
        }
        return tensv;
    }

    public void Themsv(){
        Hocsinh sv = new Hocsinh();
        sv.nhaphs();
        DanhsachHS.add(sv);
    }

    public void Xoasv(){
        String msv;
        msv = sc.nextLine();
        int i = this.DanhsachHS.indexOf(msv);
        DanhsachHS.remove(i);
    }

    public void nhaplop(){
        System.out.print("Ten lop: ");
        this.TenLop = sc.nextLine();
        System.out.print("Ma Lop: ");
        this.MaLop = sc.nextLine();
        System.out.print("Lop Truong: ");
        this.LopTruong = sc.nextLine();
    }    

    public void xuatLop(){
        System.out.println("Ten lop: " + this.TenLop);
        
        System.out.println("Ma Lop: " + this.MaLop);
    
        System.out.println("Lop Truong: " + this.LopTruong);
        
    }    


    public float Tongdiem(){
        float sum = 0;
        for(int i=0;i<DanhsachHS.size();i++){
            sum+= DanhsachHS.get(i).Diemtb();
        }
        return sum;
    }

}