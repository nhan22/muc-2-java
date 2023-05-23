/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontapmuc2_cau3;

/**
 *
 * @author ADMIN
 */
//Câu 3(c): Xây dựng chương trình java có 1 lớp chính, 1 lớp ngoài thực hiện các công 
//việc sau:
//- Nhập dữ liệu cho 3 cạnh tam giác
//- Tính diện tích tam giác
//- Tính chu vi tam giác
public class OnTapMuc2_Cau3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TamGiac tamgiac1 = new TamGiac();
        tamgiac1.nhap();
        tamgiac1.xuat();
        tamgiac1.tinhDienTich();
        tamgiac1.tinhChuVi();
    }
    
}
