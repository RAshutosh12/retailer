package com.rsky.retailer.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping(value  = "/products")
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }

    @GetMapping(value = "/products/{productName}")
    public List<Product> findProducts(@PathVariable(name = "productName") String productName){
        return productService.getProductByName(productName);
    }

    @PostMapping(value = "/products/addProducts")
    public void addProducts(@RequestBody List<Product> productList){
        productService.saveProduct(productList);
    }

    @DeleteMapping(value = "/products/removeProduct/{id}")
    public String removeProduct(@PathVariable(name = "id") Long productId){
        return productService.remove(productId);
    }
}
