package com.legiasoft.repository;

import com.legiasoft.model.Product;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;


public interface ProductRepository extends DatastoreRepository<Product, String> {

}
