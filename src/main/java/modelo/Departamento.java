package modelo;

/**
 * Classe que representa um Departamento.
 * Contém atributos e métodos getter/setter para o departamento.
 */
public class Departamento {
    private int idDepto;
    private String descDepto;

    /**
     * Obtém o ID do departamento.
     *
     * @return O ID do departamento.
     */
    public int getIdDepto() {
        return idDepto;
    }

    /**
     * Define o ID do departamento.
     *
     * @param idDepto O ID a ser atribuído ao departamento.
     */
    public void setIdDepto(int idDepto) {
        this.idDepto = idDepto;
    }

    /**
     * Obtém a descrição do departamento.
     *
     * @return A descrição do departamento.
     */
    public String getDescDepto() {
        return descDepto;
    }

    /**
     * Define a descrição do departamento.
     *
     * @param descDepto A descrição a ser atribuída ao departamento.
     */
    public void setDescDepto(String descDepto) {
        this.descDepto = descDepto;
    }
}
