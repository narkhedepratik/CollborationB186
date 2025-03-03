package com.cjc.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Product;

@RestController
public class ProductController {

@PostMapping("/save")	
public String saveData(@RequestBody Product p) {
return "inserted";	
}

}
