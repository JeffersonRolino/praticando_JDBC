package ZZCjdbc.db;

import ZZCjdbc.classes.Comprador;
import ZZCjdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorDB {
    public static void salvar(Comprador comprador){
        // 1. Comando a ser executado...
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCPF() + "', '" + comprador.getNome() + "');";

        // 2. Estabelecer conexão...
        Connection conn = ConexaoFactory.getConexao();

        // 3. Criar Statement...
        try {
            Statement stm = conn.createStatement();
            if(stm != null){
                System.out.println(stm.executeUpdate(sql));
                ConexaoFactory.close(conn, stm);
                System.out.println("Registro adicionado com sucesso...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Comprador comprador){
        if(comprador == null || comprador.getId() == 0){
            System.out.println("Não foi possível excluir o registro...");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + comprador.getId() + "');";

        Connection conn = ConexaoFactory.getConexao();

        try {
            Statement stm = conn.createStatement();
            if(stm == null){
                System.out.println("Não foi possível excluir o registro... Statement retornando nulo!");
            }
            else{
                System.out.println(stm.executeUpdate(sql));
                ConexaoFactory.close(conn, stm);
                System.out.println("Registro excluido com sucesso...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador){
        if(comprador == null || comprador.getId() == 0){
            System.out.println("Não foi possível atualizar o registro...");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCPF() + "', `nome` = '" + comprador.getNome() + "' WHERE (`id` = '" + comprador.getId()+ "');";

        Connection conn = ConexaoFactory.getConexao();

        try {
            Statement stm = conn.createStatement();
            if(stm == null){
                System.out.println("Não foi possível excluir o registro... Statement retornando nulo!");
            }
            else{
                System.out.println(stm.executeUpdate(sql));
                ConexaoFactory.close(conn, stm);
                System.out.println("Registro atualizado com sucesso...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
