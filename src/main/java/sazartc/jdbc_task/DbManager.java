package sazartc.jdbc_task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created  on 01.06.2015.
 */
public class DbManager {

    public static Connection getConnection() {

        final String DB_PROP_FILENAME = "src\\main\\resources\\sazartc\\jdbc_task\\db.prop";
        final Properties dbProperties = new Properties();

        try (FileInputStream dbPropertiesStream = new FileInputStream(DB_PROP_FILENAME)) {
            dbProperties.load(dbPropertiesStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbProperties.getProperty("db_host"),
                    dbProperties.getProperty("db_user"), dbProperties.getProperty("db_pass"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}