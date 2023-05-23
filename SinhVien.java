/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
//Câu 1(a): Xây dựng chương trình java có 1 lớp chính, 1 lớp ngoài thực hiện các công 
//việc sau:
//- Nhập thông tin sinh viên: họ tên, mã sinh viên, điểm toán, điểm văn
//- Tính điểm trung bình của 2 điểm trên
//- Xếp loại sinh viên theo điểm trung bình (<5 loại kém; >7 loại giỏi; còn lại loại 
//khá)
public class SinhVien {
    String hoTen, mSV;
    float dToan, dVan;
    
    //nhập
    public SinhVien(){
        this.hoTen = "";
        this.mSV = "";
        this.dToan = 0;
        this.dVan = 0;
    }
    
    public SinhVien(String hoTen,String mSV, float dToan,float dVan) {
        this.hoTen = hoTen;
        this.mSV = mSV;
        this.dToan = dToan;
        this.dVan = dVan;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten: "); hoTen =  scanner.nextLine();
        System.out.println("Nhap ma sinh vien: "); mSV =  scanner.nextLine();
        do{
            System.out.println("Nhap diem toan: "); dToan =  scanner.nextFloat();
            if (dToan < 0 || dToan > 10) System.out.println("Nhap lai diem toan");
        }while(dToan < 0 || dToan > 10);
        do{
            System.out.println("Nhap diem van: "); dVan =  scanner.nextFloat();
            if (dVan < 0 || dVan > 10) System.out.println("Nhap lai diem van");
        }while(dVan < 0 || dVan > 10);
    }
    
    public float dtb(){
        return (float) (dToan + dVan)/2;
    }
    
    public String xepLoai(){
        String str = new String();
        if (dtb() > 7){
            str = "Gioi";
        }
        else if (dtb() < 5){
            str = "Kem";
        }
        else {
            str = "Kha";
        }
        return str;
    }
    
    public void Xuat(){
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Ma sinh vien: " + mSV);
        System.out.println("Diem toan: " + dToan);
        System.out.println("Diem van: " + dVan);
        System.out.println("DTB: " + dtb());
        System.out.println("Xep Loai: " + xepLoai());
    }
    
}
