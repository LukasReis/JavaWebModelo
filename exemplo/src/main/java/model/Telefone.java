package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tipoTelefone;
	private String numero;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Pessoa pessoa;

	// Metodos Acessores e Modificadores

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	//Método toString
	@Override
	public String toString() {
		return "Telefone [id=" + id + ", tipoTelefone=" + tipoTelefone + ", numero=" + numero + ", pessoa=" + pessoa
				+ "]";
	}

}
