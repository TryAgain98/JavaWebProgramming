/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan's PC
 */
public class Sql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        xuly x=new xuly();
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("=========Menu========");
            System.out.println("1.Hiển thị tên , khoa của các độc giả và sắp xếp theo khoa");
            System.out.println("2.tìm những độc giả mượn sách ? vào ngày ?");
            System.out.println("3.hiện thị tên ,số thẻ,tên sách của tất cả độc giả mượn sách trong tháng ?");
            System.out.println("4.danh sách các sách không ai mượn");
            System.out.println("5.cho biết đọc giả tên ? mượn sách bao nhiêu lần");
            System.out.println("6.Danh sách tên ,số thẻ các độc giả chưa trả sách");
            System.out.println("7. Exit");
            System.out.println("Nhập số :");
            number = input.nextInt();
            switch (number) {
                case 1:
                    x.showName();
                        break;
                case 2: x.borrowBook("van", "2013-05-02");
                    break;
                case 3:x.borrowBook("2013-05-02");
                    break;
                case 4:x.notNull();
                    break;
                case 5:x.countBook("toan");
                    break;
                case 6:x.notBook();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Not valid");
            }
        } while (true);

    }

}
