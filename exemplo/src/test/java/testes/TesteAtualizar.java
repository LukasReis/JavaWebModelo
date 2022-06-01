package testes;

import org.junit.Test;

import dao.DaoGeneric;
import model.Pessoa;

public class TesteAtualizar {

	@Test
	public void testarAtulizacaoEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = daoGeneric.listarUnidade(102L, Pessoa.class);
		pessoa.setSenha("Luquinhas");
		pessoa = daoGeneric.atualizar(pessoa);
		System.out.println(pessoa);

	}

}
