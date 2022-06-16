package ZZCjdbc.test;

import ZZCjdbc.classes.Comprador;
import ZZCjdbc.conn.ConexaoFactory;
import ZZCjdbc.db.CompradorDB;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) {
        Comprador comprador = new Comprador("111.111.111-20", "Carlo Alberto de Souza");

        CompradorDB compradorDB = new CompradorDB();
        compradorDB.salvar(comprador);
    }
}
