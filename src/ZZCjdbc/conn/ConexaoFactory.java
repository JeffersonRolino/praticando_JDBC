package ZZCjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {
    //java.sql = Connection, Statement, ResultSet: Três principais interfaces

    // Classe DriveManager - Busca conector específico...
    public static Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "root";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conexao){
        try {
            if(conexao != null){
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conexao, Statement statement){
        close(conexao);
        try {
            if(statement != null){
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
