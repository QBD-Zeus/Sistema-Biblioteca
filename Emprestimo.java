import java.util.Date;

public class Emprestimo {
    private int id;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    // Construtor da classe Emprestimo
    public Emprestimo(int id, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        this.id = id;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Getters e setters para os atributos da classe Emprestimo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
