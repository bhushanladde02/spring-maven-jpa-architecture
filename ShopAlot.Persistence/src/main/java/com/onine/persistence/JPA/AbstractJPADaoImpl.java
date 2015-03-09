package com.onine.persistence.JPA;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class AbstractJPADaoImpl<T> implements Dao<T> {

	private EntityManager entityManager;
	@PersistenceContext
	public void setEntityManager(final EntityManager em) {
		this.entityManager = em;		
	}
	protected Class<T> domainClass;

	@SuppressWarnings("unchecked")
	protected Class<T> getDomainClass() {
		if (domainClass == null) {
			final ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
			this.domainClass = (Class<T>) thisType.getActualTypeArguments()[0];
		}
		return domainClass;
	}

	protected String getDomainClassName() {
		return getDomainClass().getName();
	}

	@Override
	public void delete(T t) {
		entityManager.remove(t);
	}

	@Override
	public T get(long id) {
		return entityManager.find(getDomainClass(), id);
	}

	@Override
	public T get(Object id) {
		return entityManager.find(getDomainClass(), id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(String query) {
		return (T) entityManager.createQuery("FROM "+ getDomainClassName() + " WHERE " + query).getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> getMultipleRows(String query) {
		return (Collection<T>) entityManager.createQuery("FROM "+ getDomainClassName() + " WHERE " + query).getResultList();
	}
	
	@Override
	public T insertOrUpdate(T t) {
		final T merged = entityManager.merge(t);
		System.out.println("Just persisted " + getDomainClassName() + " " 
				+ merged + " while persisting " + t);
		return merged;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> findAll() {
		return entityManager.createQuery(" FROM " + getDomainClassName()).getResultList();
	}

	@Override
	public long count() {
		return (Long) entityManager.createQuery("SELECT COUNT(*) FROM " 
				+ getDomainClassName()).getSingleResult();
	}

	@Override
	public void deleteAll() {
		entityManager.createQuery("DELETE " + getDomainClassName()).executeUpdate();
	}

	@Override
	public void deleteById(long id) {
		entityManager.remove(get(id));
	}
	

}