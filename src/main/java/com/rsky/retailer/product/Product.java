package com.rsky.retailer.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @Column(name = "name")
    private String productName;

    @Column(name = "seller_id")
    private String sellerId;


    public Product() {
    }

    public Product(Long productId, String productName, String sellerId) {
        this.productId = productId;
        this.productName = productName;
        this.sellerId = sellerId;
    }


    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public String toString() {
        return "{" +
            " productId='" + getProductId() + "'" +
            ", productName='" + getProductName() + "'" +
            ", sellerId='" + getSellerId() + "'" +
            "}";
    }

}
