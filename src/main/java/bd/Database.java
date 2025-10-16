package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Database {
    private static final String JDBC_URL = "jdbc:h2:mem:sample;DB_CLOSE_DELAY=-1;MODE=PostgreSQL";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    private Database() {}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
}
