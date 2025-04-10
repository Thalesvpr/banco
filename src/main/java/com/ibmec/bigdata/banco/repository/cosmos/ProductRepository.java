package com.ibmec.bigdata.banco.repository.cosmos;

import com.ibmec.bigdata.banco.model.Product;
import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;


@Repository
public interface ProductRepository extends CosmosRepository<Product, String> {

}