package com.rsky.retailer.order;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rsky.retailer.product.Product;

@Entity
@Table(name = "orders")
public class Order {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    
    @Column
    private Long customerId;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private Product product;

    public Order() {
    }

    public Order(Long orderId, Long customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Product getProducList() {
        return product;
    }

    public void setProducList(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order [customerId=" + customerId + ", orderId=" + orderId + ", producList=" + product + "]";
    }

}
