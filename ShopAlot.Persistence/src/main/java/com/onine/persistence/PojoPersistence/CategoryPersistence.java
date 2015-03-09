package com.onine.persistence.PojoPersistence;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.onine.pojo.Common.Category;

@Entity
@Table(name="Category")
public class CategoryPersistence extends Category implements Serializable{

	private static final long serialVersionUID = 20120910121414L;

	public CategoryPersistence() {
		super();
	}

	public CategoryPersistence(long id,String username) {
		super(id,username);
	}

	@Id
	@GeneratedValue
	@Column(name="id")
	@Override
	public long getId() {
		return super.getId();
	}
	
	@Column(name="categoryname", nullable=false)
	@Override
	public String getCategoryName() {
		return super.getCategoryName();
	}


}