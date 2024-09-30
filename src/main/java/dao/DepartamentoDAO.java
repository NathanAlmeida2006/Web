package dao;

import modelo.Departamento;
import util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe DAO responsável por realizar operações de CRUD para a entidade Departamento.
 */
public class DepartamentoDAO {

    /**
     * Insere um novo departamento no banco de dados.
     *
     * @param departamento O departamento a ser inserido.
     * @return {@code true} se a inserção for bem-sucedida, {@code false} caso contrário.
     */
    public boolean inserirDepartamento(Departamento departamento) {
        String sql = "INSERT INTO Departamento (descDepto) VALUES (?);";
        Connection con = Conexao.conectar();

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, departamento.getDescDepto());
            stm.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Lista todos os departamentos do banco de dados.
     *
     * @return Uma lista de departamentos.
     */
    public List<Departamento> listarDepartamentos() {
        String sql = "SELECT idDepto, descDepto FROM Departamento ORDER BY descDepto;";
        List<Departamento> lista = new ArrayList<>();
        Connection con = Conexao.conectar();

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Departamento depto = new Departamento();
                depto.setIdDepto(rs.getInt("idDepto"));
                depto.setDescDepto(rs.getString("descDepto"));
                lista.add(depto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
