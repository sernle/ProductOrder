package com.legiasoft.controller;


import com.legiasoft.model.Product;
import com.legiasoft.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class ProductController {
	private final static Logger LOGGER = Logger.getLogger(ProductController.class.getName());

	private ProductRepository productRepository;
	@Autowired
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@PostMapping("/products")
	public ResponseEntity<Object> createProduct(@RequestBody Product product) {
		LOGGER.fine(String.format("Create new product %s", product));
		Product savingProduct = new Product(product.getProductCode(), product.getProductName(), product.getPrice());
		productRepository.save(savingProduct);
		return new ResponseEntity<>("successful create product ", HttpStatus.OK);
	}

	@GetMapping("/products")
	public ResponseEntity<Object> all() {
		return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
	}


	@GetMapping("/products/{id}")
	public ResponseEntity<Object> get(@PathVariable(value = "id")String id) {
		return new ResponseEntity<>(productRepository.findById(id), HttpStatus.OK);
	}

}
