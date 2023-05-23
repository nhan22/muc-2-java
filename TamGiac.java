/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontapmuc2_cau3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
//Câu 3(c): Xây dựng chương trình java có 1 lớp chính, 1 lớp ngoài thực hiện các công 
//việc sau:
//- Nhập dữ liệu cho 3 cạnh tam giác
//- Tính diện tích tam giác
//- Tính chu vi tam giác
public class TamGiac {
    float a,b,c;
    
    public boolean setTamGiac(float a, float b, float c){
        if (((a+b)>c) && ((a+c)>b) && ((b+c)>a) && a>0 && b>0 && c>0 ){
            return true;
        }
        return false;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap vao 3 canh: "); 
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            if (!setTamGiac(a, b, c)) System.out.println("Tam giac khong ton tai, vui long nhap lai!!"); 
        } while(!setTamGiac(a, b, c));  
    }
    
    public void xuat(){
        System.out.println("Do dai 3 canh: " + a + " " + b + " " + c); 
    }
    
    public void tinhDienTich(){
        float p = (a+b+c)/2;
        float s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("Dien tich tam giac: %.2f\n", s);
    }
    
    public void tinhChuVi(){
        System.out.println("Chu vi tam giac: " + (a+b+c)); 
    }
    
}
