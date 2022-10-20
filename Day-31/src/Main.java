public class Main {

    NEW ANNOUNCEMENT
    JDBC prepared stmt code
package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

    public class Main {

        public static void main(String[] args) {
            getData(1);
        }

        public static void getData(int userid) {
            String dbUrl = "jdbc:mysql://localhost:3306/sourabh";
            String username = "root";
            String password = "root123";

            try {
                Connection connection = DriverManager.getConnection(dbUrl, username, password);
                PreparedStatement prep = connection
                        .prepareStatement("insert into user (user_id,username,password) values (?,?,?)");
                prep.setInt(1, 5);
                prep.setString(2, "Infosys");
                prep.setString(3, "Narayana");
                prep.executeUpdate();

//            PreparedStatement prep = connection.prepareStatement("select * from user where user_id = ?");
//            prep.setInt(1, userid);
//            ResultSet resultSet = prep.executeQuery();
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("user_id"));
//                System.out.println(resultSet.getString("username"));
//                System.out.println(resultSet.getString("password"));
//            }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
