package com.ista.api.web.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ista.api.web.models.ProductDTO;
@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
	
	
}
