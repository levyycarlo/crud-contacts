package br.com.agenda.dao;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


	public class ContatoDAO {
	
	    private Connection connection;
	
	    
	    public ContatoDAO() {
	        try {
	            this.connection = ConnectionFactory.createConnectionToMySQL(); 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

    
    public void save(Contato contato) {
        String sql = "INSERT INTO contatos (nome, idade, dataCadastro) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, contato.getNome());
            stmt.setInt(2, contato.getIdade());
            stmt.setDate(3, new java.sql.Date(contato.getDataCadastro().getTime()));
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void update(Contato contato) {
        String sql = "UPDATE contatos SET nome = ?, idade = ?, dataCadastro = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, contato.getNome());
            stmt.setInt(2, contato.getIdade());
            stmt.setDate(3, new java.sql.Date(contato.getDataCadastro().getTime()));
            stmt.setInt(4, contato.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public boolean deleteByID(int id) {
        String sql = "DELETE FROM contatos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

   
    public Contato getContatoById(int id) {
        String sql = "SELECT * FROM contatos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Contato contato = new Contato();
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setIdade(rs.getInt("idade"));
                contato.setDataCadastro(rs.getDate("dataCadastro"));
                return contato;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    
    public List<Contato> getContatos() {
        List<Contato> contatos = new ArrayList<>();
        String sql = "SELECT * FROM contatos";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Contato contato = new Contato();
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setIdade(rs.getInt("idade"));
                contato.setDataCadastro(rs.getDate("dataCadastro"));
                contatos.add(contato);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contatos;
    }
}
