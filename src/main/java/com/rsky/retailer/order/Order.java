package com.rsky.retailer.order;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    
    @Column
    private Long customerId;

    @Column
    @ElementCollection
    private List<Long> producList;

    public Order() {
    }

    public Order(Long orderId, Long customerId, List<Long> producList) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.producList = producList;
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

    public List<Long> getProducList() {
        return producList;
    }

    public void setProducList(List<Long> producList) {
        this.producList = producList;
    }

    @Override
    public String toString() {
        return "Order [customerId=" + customerId + ", orderId=" + orderId + ", producList=" + producList + "]";
    }

}
