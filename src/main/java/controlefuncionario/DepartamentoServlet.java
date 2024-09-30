package controlefuncionario;

import dao.DepartamentoDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Departamento;

import java.io.IOException;
import java.util.List;

/**
 * Servlet responsável por gerenciar o CRUD de departamentos.
 */
@WebServlet("/departamento")
public class DepartamentoServlet extends HttpServlet {

    private DepartamentoDAO departamentoDAO = new DepartamentoDAO();

    /**
     * Método GET para listar departamentos.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Departamento> lista = departamentoDAO.listarDepartamentos();
        req.setAttribute("departamentos", lista);
        req.getRequestDispatcher("/departamentos.jsp").forward(req, resp);
    }

    /**
     * Método POST para criar um novo departamento.
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String descDepto = req.getParameter("descDepto");

        Departamento depto = new Departamento();
        depto.setDescDepto(descDepto);

        departamentoDAO.inserirDepartamento(depto);

        resp.sendRedirect("departamento");
    }
}
