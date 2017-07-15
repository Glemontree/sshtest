package com.glemontree.ssh.action;

import com.glemontree.ssh.entities.Product;
import com.glemontree.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	private static final long serialVersionUID = 1L;
	private Product product = new Product();
	
	private ProductService productService;
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@Override
	public Product getModel() {
		return product;
	}
	
	public String save() {
		System.out.println("Action中的save方法执行了");
		productService.save(product);
		return NONE;
	}
}
