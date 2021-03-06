package testes;

import org.junit.Test;
import dao.DaoGeneric;
import model.Pessoa;
import java.util.List;

public class TesteEntityManager {

	@Test
	public void PrimeiroTesteQuery() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		List<Pessoa> listaPessoa = daoGeneric.getEntityManager().createQuery("from Pessoa where nome like '%was%'")
				.getResultList();
		for (Pessoa pessoa : listaPessoa) {
			System.out.println(pessoa);
		}
	}

	@Test
	public void SegundoTesteQuery() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		List<Pessoa> listaPessoa = daoGeneric.getEntityManager().createQuery("from Pessoa order by nome")
				.setMaxResults(2).getResultList();
		for (Pessoa pessoa : listaPessoa) {
			System.out.println(pessoa);
		}

	}

	@Test
	public void TerceiroTesteQury() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		List<Pessoa> listaPessoa = daoGeneric.getEntityManager().createQuery("from Pessoa order by nome")
				.setMaxResults(2).getResultList();
		for (Pessoa pessoa : listaPessoa) {
			System.out.println(pessoa);
		}

	}

	@Test
	public void TesteQuerySoma() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		int somaidade = (int) daoGeneric.getEntityManager().createQuery("select sum(p.idade) from Pessoa p ")
				.getSingleResult();
		System.out.println("A soma das idades é igual a" + somaidade);
	}

	@Test
	public void TesteNamedQuery() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		List<Pessoa> listaPessoa = daoGeneric.getEntityManager().createNamedQuery("consultarTodosUsuarios")
				.getResultList();
		for (Pessoa pessoa : listaPessoa) {
			System.out.println(pessoa);
		}
	}

	@Test
	public void TesteSecundNamedQuery() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		List<Pessoa> listaPessoa = daoGeneric.getEntityManager().createNamedQuery("consultarBuscaNome")
				.setParameter("nome", "Lucas").getResultList();
		for (Pessoa pessoa : listaPessoa) {
			System.out.println(pessoa);
		}
	}

}
