package testes;

import org.junit.Test;
import dao.DaoGeneric;
import model.Pessoa;

public class TesteSalvar {

	@Test
	public void testSalvarEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Lucas");
		pessoa.setSobreNome("Reis");
		pessoa.setIdade(21);
		pessoa.setEmail("Luke.silvareis@hotmail.com");
		pessoa.setSenha("JRSAL");

		daoGeneric.salvar(pessoa);

	}

	@Test
	public void testSalvarSegundaEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Leticia");
		pessoa.setSobreNome("Gomes");
		pessoa.setIdade(19);
		pessoa.setEmail("LeticiaGomes@hotmail.com");
		pessoa.setSenha("lquinhasLindo");

		
		daoGeneric.salvar(pessoa);
	}

	@Test
	public void testSalvarTerceiraEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Rebeca");
		pessoa.setSobreNome("Vieira");
		pessoa.setIdade(25);
		pessoa.setEmail("RebcsVieria@gmail.com");
		pessoa.setSenha("JL45k");

			
		daoGeneric.salvar(pessoa);

	}

	@Test
	public void testSalvarQuartaEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Marcos");
		pessoa.setSobreNome("Souza");
		pessoa.setIdade(15);
		pessoa.setEmail("Marco@gmail.com");
		pessoa.setSenha("sul/;25");
		
		daoGeneric.salvar(pessoa);

	}

	@Test
	public void testSalvarQuinteEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Gabriel");
		pessoa.setSobreNome("Alcantra");
		pessoa.setIdade(18);
		pessoa.setEmail("GabrielAlcantra@gmail.com");
		pessoa.setSenha("sal58977");

		
		daoGeneric.salvar(pessoa);

	}

	@Test
	public void testSalvarSextaEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Suzana");
		pessoa.setSobreNome("Amorim");
		pessoa.setIdade(19);
		pessoa.setEmail("SuAmorim@gmail.com");
		pessoa.setSenha("ooo123y");

		
		daoGeneric.salvar(pessoa);
	}

	@Test
	public void testSalvarSetimaEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Vitor Lucas");
		pessoa.setSobreNome("Aragão");
		pessoa.setIdade(21);
		pessoa.setEmail("ViLucaAragao@gmail.com");
		pessoa.setSenha("IIlambida56");

		daoGeneric.salvar(pessoa);

	}

	@Test
	public void testSalvarOitavaEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Rafaela");
		pessoa.setSobreNome("Oliveria");
		pessoa.setIdade(29);
		pessoa.setEmail("RafaOliveria@gmail.com");
		pessoa.setSenha("%%111HOL");

		
		daoGeneric.salvar(pessoa);

	}

	@Test
	public void testSalvarNonaEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Gustavo");
		pessoa.setSobreNome("Rodrigues");
		pessoa.setIdade(9);
		pessoa.setEmail("GustavinhoRodrigis@gmail.com");
		pessoa.setSenha("J51172./");

		
		daoGeneric.salvar(pessoa);

	}

	@Test
	public void testSalvarDecimaEntidade() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Pedro");
		pessoa.setSobreNome("Alcantra");
		pessoa.setIdade(18);
		pessoa.setEmail("PedroAlcantra@gmail.com");
		pessoa.setSenha("58974");
		
		daoGeneric.salvar(pessoa);
	}
}
