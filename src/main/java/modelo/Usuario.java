package modelo;

/**
 * Classe que representa um Usuário do sistema.
 * Contém atributos e métodos getter/setter para o usuário.
 */
public class Usuario {
    private String email;
    private String senha;

    /**
     * Obtém o email do usuário.
     *
     * @return O email do usuário.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do usuário.
     *
     * @param email O email a ser atribuído ao usuário.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém a senha do usuário.
     *
     * @return A senha do usuário.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do usuário.
     *
     * @param senha A senha a ser atribuída ao usuário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
