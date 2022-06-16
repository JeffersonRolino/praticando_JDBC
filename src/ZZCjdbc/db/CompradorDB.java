package ZZCjdbc.db;

import ZZCjdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorDB {
    public void salvar(){
        // 1. Comando a ser executado...
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('089.440.348.52', 'Maria Aparecida da Motta');";

        // 2. Estabelecer conexão...
        Connection conn = ConexaoFactory.getConexao();

        // 3. Criar Statement...
        try {
            Statement stm = conn.createStatement();
            if(stm != null){
                System.out.println(stm.executeUpdate(sql));
                ConexaoFactory.close(conn, stm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
