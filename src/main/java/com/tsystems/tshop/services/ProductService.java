package com.tsystems.tshop.services;

import com.tsystems.tshop.domain.Product;

import java.util.List;

public interface ProductService {

	Product getProductById(final Long id);
	List<Product> getProducts();
	
}
