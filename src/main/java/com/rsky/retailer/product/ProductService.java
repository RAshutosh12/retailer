package com.rsky.retailer.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public List<Product> getProductByName(String productName){
        return productRepo.findByProductName(productName);
    }

    public void saveProduct(List<Product> product){
        productRepo.saveAll(product);
    }

    public String remove(Long productId){
       
        productRepo.deleteById(productId);

        return "deleted";
    }

}
