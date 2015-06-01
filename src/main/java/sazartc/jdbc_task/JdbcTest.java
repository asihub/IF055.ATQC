package sazartc.jdbc_task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created on 01.06.2015.
 */
public class JdbcTest {
    public static void main(String[] args) {

        try(Connection omsDbConnection = DbManager.getConnection()) {
            PreparedStatement statement = omsDbConnection
                    .prepareStatement("select * from users where not id=?");
            statement.setInt(1, 5);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                System.out.println(resultSet.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
