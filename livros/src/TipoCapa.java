public class TipoCapa {
    private Integer id;
    private String descricao;

    public TipoCapa() {
        
    }
    
    public TipoCapa(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
