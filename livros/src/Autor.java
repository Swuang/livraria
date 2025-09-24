public class Autor {
    private Integer id;
    private String nome;
    private String cidade;

    public Autor() {
        
    }

    public Autor(Integer id, String nome, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    

    public void salvar() {
        System.out.println("Salvo com sucesso!");
    }

    public void alterar() {
        System.out.println("Alterado com sucesso!");
    }

    public void excluir() {
        System.out.println("Excluído com sucesso!");
    }

    public void Pesquisar() {
        System.out.println("Pesquisa realizado com sucesso!");
    }
}
