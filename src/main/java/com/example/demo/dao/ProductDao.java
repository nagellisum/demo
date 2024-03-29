package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ProductBean;

@Repository
public interface ProductDao extends MongoRepository<ProductBean, String>{

}
