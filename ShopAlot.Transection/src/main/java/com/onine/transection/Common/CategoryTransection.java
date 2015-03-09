package com.onine.transection.Common;

import org.springframework.transaction.annotation.Transactional;

import com.onine.persistence.JPA.Dao;
import com.onine.persistence.PojoPersistence.CategoryPersistence;

public class CategoryTransection {
	Dao<CategoryPersistence> dao;

	public CategoryTransection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryTransection(Dao<CategoryPersistence> dao) {
		super();
		this.dao = dao;
	}
    	
	@Transactional
	public void insert(String name)
	{
		CategoryPersistence cat=new CategoryPersistence();
		cat.setCategoryName(name);
		dao.insertOrUpdate(cat);
	}

}
