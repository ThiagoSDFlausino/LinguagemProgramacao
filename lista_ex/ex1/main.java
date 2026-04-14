public class main {
    public static void main(String[] args) {
        // Criando usuários
        Usuario oUsuario1 = new Usuario("João", "12345");
        Usuario oUsuario2 = new Usuario("Maria", "67890");

        // Criando livros
        Livro oLivro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true);
        Livro oLivro2 = new Livro("1984", "George Orwell", true);
        Livro oLivro3 = new Livro("A Revolução dos Bichos", "George Orwell", true);

        // Criando empréstimos
        Emprestimo oEmprestimo1 = new Emprestimo();
        oEmprestimo1.setUsuario(oUsuario1);
        oEmprestimo1.adicionarLivro(oLivro1);
        oEmprestimo1.adicionarLivro(oLivro2);

        Emprestimo oEmprestimo2 = new Emprestimo();
        oEmprestimo2.setUsuario(oUsuario2);
        oEmprestimo2.adicionarLivro(oLivro3);

        oEmprestimo2.finalizarEmprestimo();
    }
}
