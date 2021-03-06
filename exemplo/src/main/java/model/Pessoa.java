package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@NamedQueries({ @NamedQuery(name = "consultarTodosUsuarios", query = "select p from Pessoa p"), // Qurys personalizadas
		@NamedQuery(name = "consultarBuscaNome", query = "select p from Pessoa p where p.nome = :nome ")

})

public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String sobreNome;
	private Integer idade;
	private String email;
	private String senha;

	@OneToMany(mappedBy = "pessoa", fetch = FetchType.EAGER)
	private List<Telefone> telefoneUsuario;

	// Métodos Acessores e Modificadores

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Telefone> getTelefoneUsuario() {
		return telefoneUsuario;
	}

	public void setTelefoneUsuario(List<Telefone> telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}

	// Método toString
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + ", email="
				+ email + ", senha=" + senha + ", telefoneUsuario=" + telefoneUsuario + "]";
	}

}
