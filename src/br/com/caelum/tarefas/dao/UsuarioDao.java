package br.com.caelum.tarefas.dao;

import br.com.caelum.tarefas.conexao.ConnectionFactory;
import br.com.caelum.tarefas.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {
    private Connection connection;

    public UsuarioDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public boolean existeUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuário não deve ser nulo");
        } else {
            try {
                PreparedStatement stmt = this.connection.prepareStatement("select * from usuarios where login = ? and senha = ?");
                stmt.setString(1, usuario.getLogin());
                stmt.setString(2, usuario.getSenha());
                ResultSet rs = stmt.executeQuery();
                boolean encontrado = rs.next();
                rs.close();
                stmt.close();
                return encontrado;
            } catch (SQLException var5) {
                throw new RuntimeException(var5);
            }
        }
    }
}