package  com.biblioteca.model.dao;

import java.util.List;

import com.biblioteca.model.entity.Livro;

public class LivroDAO implements IDAO<Livro> {

  @Override
  public void cadastrar(Livro entidade) {
    String sql = "INSERT INTO LIVRO (titulo,autor,numPaginas) VALUES (?, ?, ?)";
    throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
  }

  @Override
  public void atualizar(Livro entidade) {
    String sql = "UPDATE LIVRO SET titulo=?, autor=? numPaginas=? WHERE ID=?";
    throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
  }

  @Override
  public void excluir(int id) {
    String sql = "DELETE FROM LIVRO WHERE ID=?";
    throw new UnsupportedOperationException("Unimplemented method 'excluir'");
  }

  @Override
  public Livro buscar(int id) {
    String sql = "SELECT * FROM LIVRO";
    throw new UnsupportedOperationException("Unimplemented method 'buscar'");
  }

  @Override
  public List<Livro> listar() {
    String sql = "SELECT * FROM LIVRO WHERE ID=?";
    throw new UnsupportedOperationException("Unimplemented method 'listar'");
  }

}