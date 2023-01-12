package com.omrmtn.eshoppingapp.product.repository.mongo;

import com.omrmtn.eshoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
