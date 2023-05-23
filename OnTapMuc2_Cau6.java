/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontapmuc2_cau6;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class OnTapMuc2_Cau6 {
    static String DATABASE_URL = "jdbc:mysql://localhost:3306/taobang";
    static String USER_NAME = "root";
    static String PASSWORD = "";
    
    public static void main(String[] args) {
        try {
            Connection connection = getConnection(DATABASE_URL, USER_NAME, PASSWORD);
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `student`");
            
            while (resultSet.next()) {                
                System.out.printf("%-5d %-20s %-15s %-20s %-10s %-10s\n", 
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6)
                        
                );
                
            }
            
            connection.close();
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection(String DATABASE_URL, String USER_NAME, String PASSWORD){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
            System.out.println("Da lien ket thanh cong");
        } catch (Exception e) {
            System.out.println("Da lien ket that bai");
            e.printStackTrace();
        }
        return connection;
    }
    
}
