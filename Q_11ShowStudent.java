
import java.sql.*;

public class Q_11ShowStudent {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:ucanaccess://D:/JavaDatabase/ICE_PUST.accdb");

        ResultSet rs = con.createStatement().executeQuery(
            "SELECT * FROM Student");

        while (rs.next())
            System.out.println(rs.getInt("Roll") + "  "
                + rs.getString("StudentName"));

        con.close();
    }
}
