package com.sarthak.springorm.product.dao.test;

import com.sarthak.springorm.product.dao.ProductDao;
import com.sarthak.springorm.product.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/springorm/product/dao/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		product.setName("Apple");
		product.setDesc("SomeDescriptions");
		product.setPrice(700.5);
		productDao.create(product);
	}
}
