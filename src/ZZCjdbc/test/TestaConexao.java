package ZZCjdbc.test;

import ZZCjdbc.conn.ConexaoFactory;

public class TestaConexao {
    public static void main(String[] args) {
        ConexaoFactory conn = new ConexaoFactory();
        conn.getConexao();
    }
}
