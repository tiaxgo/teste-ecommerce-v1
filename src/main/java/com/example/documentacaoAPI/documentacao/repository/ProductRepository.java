package com.example.documentacaoAPI.documentacao.repository;

import com.example.documentacaoAPI.documentacao.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}