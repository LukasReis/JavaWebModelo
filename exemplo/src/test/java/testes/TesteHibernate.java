package testes;

import org.junit.Test;
import hibernate.HibernateUtil;

public class TesteHibernate {

	@Test
	public void testaHibernateUtil() {
		HibernateUtil.getEntityManager();
	}

}
