/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uasnurul;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel IT Computer
 */
public class UASNURUL {
private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        if (mysqlkonek==null){
            try {
                String DB="jdbc:mysql://localhost:3306/belanja";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek=(Connection) DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        } return mysqlkonek;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
