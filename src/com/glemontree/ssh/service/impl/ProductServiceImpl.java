package com.glemontree.ssh.service.impl;

import com.glemontree.ssh.dao.ProductDao;
import com.glemontree.ssh.entities.Product;
import com.glemontree.ssh.service.ProductService;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public void save(Product product) {
		System.out.println("Service中的save方法执行了");
		productDao.save(product);
	}
	
	
}
