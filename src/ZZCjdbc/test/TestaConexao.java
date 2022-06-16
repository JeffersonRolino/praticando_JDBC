package ZZCjdbc.test;

import ZZCjdbc.conn.ConexaoFactory;
import ZZCjdbc.db.CompradorDB;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) {
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.salvar();
    }
}
