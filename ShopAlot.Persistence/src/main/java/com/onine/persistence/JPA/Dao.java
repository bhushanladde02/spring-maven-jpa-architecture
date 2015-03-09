package com.onine.persistence.JPA;

import java.util.Collection;

public interface Dao<T> {
	public void delete(T t) ;
	public T get(long id) ;
	public T get(Object id);
	public T get(String query) ;
	public Collection<T> getMultipleRows(String query);
	public T insertOrUpdate(T t);
	public Collection<T> findAll();
	public long count() ;
	public void deleteAll() ;
	public void deleteById(long id) ;

}
