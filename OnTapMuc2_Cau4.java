/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontapmuc2_cau4;

import java.util.Scanner;


public class OnTapMuc2_Cau4 {
        public class TamGiac {
        double a,b,c;

        public boolean setTamGiac(double a, double b, double c){
            return ((a+b)>c) && ((a+c)>b) && ((b+c)>a) && a>0 && b>0 && c>0;
        }

        public void nhap(){
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Nhap vao 3 canh: "); 
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                if (!setTamGiac(a, b, c)) System.out.println("Tam giac khong ton tai, vui long nhap lai!!"); 
            } while(!setTamGiac(a, b, c));  
        }

        public void xuat(){
            System.out.println("Do dai 3 canh: " + a + " " + b + " " + c); 
        }

        public void tinhDienTich(){
            double p = (a+b+c)/2;
            double s = (double) Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("Dien tich tam giac: %.2f\n", s);
        }

        public void tinhChuVi(){
            System.out.println("Chu vi tam giac: " + (double) (a+b+c)); 
        }
    
    }

    public static void main(String[] args) {
        System.out.println("Cau4");
        TamGiac tamgiac1 = new OnTapMuc2_Cau4(). new TamGiac();
        tamgiac1.nhap();
        tamgiac1.xuat();
        tamgiac1.tinhDienTich();
        tamgiac1.tinhChuVi();
    }
    
}
