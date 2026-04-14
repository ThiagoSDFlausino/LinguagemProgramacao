import java.util.ArrayList;

public class Emprestimo {
    private Usuario usuario;
    private ArrayList<Livro> livros;

    public Emprestimo(Usuario usuario) {
        this.usuario = usuario;
        this.livros = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        if (livro.isDisponivel() == false) {
            System.out.println("O livro não está disponível para empréstimo.");
        } else {
            livos.setDisponivel(false);
            this.livros.add(livro);
            System.out.println("Livro: " + livro.getTitulo() + " emprestado para o usuário: " + this.getUsuario().getNome());
        }
    }

    public void finalizarEmprestimo() {
        for (int i=0; i < this.livros.size(); i++) {
            this.livros.get(i).setDisponivel(true);
            this.livros.remove(this.livros.get(i));
        }
            
    }

}
