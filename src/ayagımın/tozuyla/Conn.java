package ayagımın.tozuyla;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///gezi", "root", "1234");
            s = c.createStatement();

        } catch (Exception e) {

        }
    }
}
