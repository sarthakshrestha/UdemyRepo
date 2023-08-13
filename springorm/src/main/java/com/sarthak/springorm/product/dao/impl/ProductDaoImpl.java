package com.sarthak.springorm.product.dao.impl;

import com.sarthak.springorm.product.dao.ProductDao;
import com.sarthak.springorm.product.model.Product;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		return (Integer) hibernateTemplate.save(product);
	}

}
