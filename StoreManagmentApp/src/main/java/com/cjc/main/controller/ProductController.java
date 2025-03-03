package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.main.model.Product;

import com.cjc.main.model.Product;

@RestController
public class ProductController {

	
@GetMapping("get_products")
public List<Product> getAllProducts()
{
	return new ArrayList<>();
}


@PostMapping("/save")	
public String saveData(@RequestBody Product p) {
return "inserted";	
}
}
