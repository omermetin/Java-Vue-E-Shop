package com.omrmtn.eshoppingapp.product.repository.mongo;

import com.omrmtn.eshoppingapp.product.domain.category.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
