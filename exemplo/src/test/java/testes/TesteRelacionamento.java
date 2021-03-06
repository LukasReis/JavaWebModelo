package testes;

import java.util.List;

import org.junit.Test;

import dao.DaoGeneric;
import model.Pessoa;
import model.Telefone;

public class TesteRelacionamento {

	@Test
	public void testeRelacaoCadastar() {
		DaoGeneric daoGeneric = new DaoGeneric();
		Pessoa pessoa = (Pessoa) daoGeneric.listarUnidade(309L, Pessoa.class);
		Telefone telefone = new Telefone();
		telefone.setTipoTelefone("cpmercial");
		telefone.setNumero("040028922");
		telefone.setPessoa(pessoa);
		daoGeneric.salvar(telefone);
	}

	@Test
	public void testeRelacaoListar() {
		DaoGeneric daoGeneric = new DaoGeneric();
		Pessoa pessoa = (Pessoa) daoGeneric.listarUnidade(309L, Pessoa.class);
		for (Telefone telefone : pessoa.getTelefoneUsuario()) {
			System.out.println(telefone.getTipoTelefone());
			System.out.println(telefone.getNumero());
			System.out.println(telefone.getPessoa().getNome());
			System.out.println("-----------------------------------");

		}
	}

}
