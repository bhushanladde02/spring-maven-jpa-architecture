
package com.onine.persistence.JPADao;
import org.springframework.stereotype.Repository;

import com.onine.persistence.JPA.AbstractJPADaoImpl;
import com.onine.persistence.JPA.Dao;
import com.onine.persistence.PojoPersistence.LoginPersistence;

@Repository("categoryDao")
public class CategoryPersistenceDaoImpl  extends AbstractJPADaoImpl< LoginPersistence> 
implements Dao<LoginPersistence>{

}