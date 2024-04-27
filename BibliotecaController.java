import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {
    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_seu_banco";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    // Método para obter conexão com o banco de dados
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método para cadastrar livro na biblioteca
    public void cadastrarLivro(Livro livro) {
        try (Connection connection = getConnection()) {
            String sql = "INSERT INTO livros (titulo, autor, emprestado) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, livro.getTitulo());
            statement.setString(2, livro.getAutor());
            statement.setBoolean(3, livro.isEmprestado());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para listar todos os livros da biblioteca
    public List<Livro> listarLivros() {
        List<Livro> livros = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM livros";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                boolean emprestado = resultSet.getBoolean("emprestado");
                Livro livro = new Livro(id, titulo, autor, emprestado);
                livros.add(livro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livros;
    }

    // Métodos para emprestarLivro e devolverLivro
    // Implemente esses métodos conforme necessário
}
