package com.sthev.crud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sthev.crud.domain.product.Product;
import com.sthev.crud.domain.product.ProductRepository;
import com.sthev.crud.domain.product.RequestProduct;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;
    @GetMapping
    public ResponseEntity<List<Product>>getAllProducts(){
       List<Product> allProducts = repository.findAll();
       return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
        Product newProduct = new Product(data);
        repository.save(newProduct);
        return ResponseEntity.ok().build();
    }
    
    @PutMapping
    @Transactional
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data) {
    	Optional<Product> optionalProduct = repository.findById(data.id());
    	if(optionalProduct.isPresent()) {
    		Product product = optionalProduct.get();
    		product.setName(data.name());
    		product.setPrince_in_cents(data.prince_in_cents());
    		return ResponseEntity.ok(product);
    	}
    	return ResponseEntity.notFound().build();
    }
    
    
}




