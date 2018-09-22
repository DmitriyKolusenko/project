package com.tsystems.tshop.controllers;

import org.springframework.web.bind.annotation.*;

import com.tsystems.tshop.domain.Product;
import com.tsystems.tshop.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private final ProductService productService;
	
	public ProductController(final ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getProducts() {
		return productService.getProducts();
	}

}
