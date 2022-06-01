package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import hibernate.HibernateUtil;

public class DaoGeneric<E> {
	private EntityManager entityManager = HibernateUtil.getEntityManager();

	// Método para salvar um entidade no banco de dados
	public void salvar(E entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entidade);
		transaction.commit();
	}

	// Método para listar todas as entidades
	public List<E> listarTodos(Class<E> entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		List<E> lista = entityManager.createQuery("from " + entidade.getName()).getResultList();
		transaction.commit();
		return lista;
	}

	// Método para lista uma entidade em especifico
	public E listarUnidade(Long id, Class<E> entidade) {
		E e = (E) entityManager.find(entidade, id);
		return e;
	}

	// Método para atulizar uma entidade
	public E atualizar(E entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		E entidadeAtualizada = entityManager.merge(entidade);
		transaction.commit();
		return entidadeAtualizada;

	}

	// Método para deletar uma entidade
	public void deletar(E entidade) {
		Object id = HibernateUtil.getPrimaryKey(entidade);
		EntityTransaction trasaction = entityManager.getTransaction();
		trasaction.begin();
		entityManager
				.createNativeQuery(
						"delete from " + entidade.getClass().getSimpleName().toLowerCase() + "where cod=" + id)
				.executeUpdate();
		trasaction.commit();
	}
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

}
