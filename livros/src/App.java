public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor(1, "J.K. Rowling", "Yate");
        Editora editora = new Editora(1, "Rocco"); 
        TipoCapa tipoCapa = new TipoCapa(1, "Dura");
        Livro livro = new Livro(1, "Harry Potter e a Pedra Filosofal", "Um jovem bruxo descobre seus poderes e enfrenta desafios mágicos.", 1, 1997, 223, autor, editora, tipoCapa);
    
        Autor autor2 = new Autor(2, "George R.R. Martin", "Bayonne");
        Editora editora2 = new Editora(2, "Leya");
        TipoCapa tipoCapa2 = new TipoCapa(2, "Mole");
        Livro livro2 = new Livro(2, "A Guerra dos Tronos", "Nobres famílias lutam pelo controle do trono em um reino cheio de intrigas e traições.", 1, 1996, 694, autor2, editora2, tipoCapa2);
    
        autor.salvar();
        autor.alterar();
        autor.excluir();
        autor.Pesquisar();
        
        editora.salvar();
        editora.alterar();
        editora.excluir();
        editora.Pesquisar();

        tipoCapa.salvar();
        tipoCapa.alterar();
        tipoCapa.excluir();
        tipoCapa.Pesquisar();

        livro.salvar();
        livro.alterar();
        livro.excluir();
        livro.Pesquisar();

        autor2.salvar();
        autor2.alterar();
        autor2.excluir();
        autor2.Pesquisar();

        editora2.salvar();
        editora2.alterar();
        editora2.excluir();
        editora2.Pesquisar();

        tipoCapa2.salvar();
        tipoCapa2.alterar();
        tipoCapa2.excluir();
        tipoCapa2.Pesquisar();

        livro2.salvar();
        livro2.alterar();
        livro2.excluir();
        livro2.Pesquisar();
    }
}
