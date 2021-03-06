package testes;

import java.util.List;

import org.junit.Test;

import dao.DaoGeneric;
import model.Pessoa;

public class TesteListar {

	@Test
	public void testarListagemGeral() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		List<Pessoa> listaPessoas = daoGeneric.listarTodos(Pessoa.class);
		for (Pessoa pessoa : listaPessoas) {
			System.out.print(pessoa);
			System.out.println("---------------------");

		}
	}

	@Test
	public void testarListagemUnicaEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = daoGeneric.listarUnidade(309L, Pessoa.class);
		System.out.print(pessoa);

	}

}
