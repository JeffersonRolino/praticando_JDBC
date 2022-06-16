package ZZCjdbc.test;

import ZZCjdbc.classes.Comprador;
import ZZCjdbc.conn.ConexaoFactory;
import ZZCjdbc.db.CompradorDB;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) {
//        deletar();
        atualizar();
    }

    public static void inserir(){
        Comprador comprador = new Comprador("111.111.111-20", "Carlo Alberto de Souza");
        CompradorDB.salvar(comprador);
    }

    public static void deletar(){
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDB.delete(comprador);
    }

    public static void atualizar(){
        Comprador comprador = new Comprador(1, "000.000.000-00", "Maria Oliveira");
        CompradorDB.update(comprador);
    }
}
