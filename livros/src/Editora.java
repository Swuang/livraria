public class Editora  {
    private Integer id;
    private String nome_editora;

    public Editora() {
        
    }
    
    public Editora(Integer id, String nome_editora) {
        this.id = id;
        this.nome_editora = nome_editora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_editora() {
        return nome_editora;
    }

    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
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
