
import java.sql.*;
import java.util.*;

public class Q_11InsertStudent {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection(
            "jdbc:ucanaccess://D:/JavaDatabase/ICE_PUST.accdb");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Roll: ");
        int r = s.nextInt();
        s.nextLine();
        System.out.print("Enter Name: ");
        String n = s.nextLine();

        c.createStatement().executeUpdate(
            "INSERT INTO Student VALUES (" + r + ", '" + n + "')");

        System.out.println("Inserted Successfully!");
        c.close();
    }
}
