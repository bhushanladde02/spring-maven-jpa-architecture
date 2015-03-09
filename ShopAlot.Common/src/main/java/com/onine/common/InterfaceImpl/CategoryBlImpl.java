package com.onine.common.InterfaceImpl;

import com.onine.common.Interface.CategoryBL;
import com.onine.transection.Common.CategoryTransection;
 
class CategoryBlImpl implements CategoryBL
{
	CategoryTransection categoryTransection;
    public CategoryBlImpl(CategoryTransection categoryTransection)
    {
    	this.categoryTransection=categoryTransection;
    }
	@Override
	public void insertBl(String name) {
		categoryTransection.insert(name);
	}
	
}