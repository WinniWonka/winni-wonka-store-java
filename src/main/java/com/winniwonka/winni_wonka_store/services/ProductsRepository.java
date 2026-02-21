package com.winniwonka.winni_wonka_store.services;

import com.winniwonka.winni_wonka_store.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
