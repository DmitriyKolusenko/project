package com.tsystems.tshop.services.impl;

import org.springframework.stereotype.Service;

import com.tsystems.tshop.domain.Product;
import com.tsystems.tshop.repositories.ProductRepository;
import com.tsystems.tshop.services.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
	
	private final ProductRepository productRepository;

	public ProductServiceImpl(final ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product getProductById(final Long id) {
		return productRepository.getProductById(id);
	}

	@Override
	public List<Product> getProducts() {
		return productRepository.getAllProducts();
	}

}
