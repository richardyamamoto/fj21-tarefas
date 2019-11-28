package br.com.caelum.tarefas.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        String DB_HOST = "jdbc:mysql://localhost/fj21";
        String DB_USER = "root";
        String DB_PASS = "000000";
        try {
            System.out.println("Conectando...");
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(DB_HOST,DB_USER,DB_PASS);
        }catch(SQLException | ClassNotFoundException e) {
            System.out.println("Erro na conexão");
            throw new RuntimeException(e);
        }
    }
}
