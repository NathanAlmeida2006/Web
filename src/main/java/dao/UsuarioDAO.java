package dao;

import modelo.Usuario;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe DAO responsável por realizar operações relacionadas ao login de usuários.
 */
public class UsuarioDAO {

    /**
     * Verifica se um usuário com as credenciais fornecidas existe no banco de dados.
     *
     * @param usuario O usuário a ser autenticado.
     * @return {@code true} se as credenciais estiverem corretas, {@code false} caso contrário.
     */
    public boolean autenticar(Usuario usuario) {
        String sql = "SELECT * FROM Usuario WHERE email = ? AND senha = ?;";
        Connection con = Conexao.conectar();

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, usuario.getEmail());
            stm.setString(2, usuario.getSenha());
            ResultSet rs = stm.executeQuery();

            return rs.next(); // Se houver resultado, as credenciais são válidas

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
