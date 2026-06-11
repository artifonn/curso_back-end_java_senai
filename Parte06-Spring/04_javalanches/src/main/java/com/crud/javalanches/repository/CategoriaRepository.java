package com.crud.javalanches.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.javalanches.models.Categoria;

public interface CategoriaRepository
        extends JpaRepository<Categoria, Long> {

    boolean existsByNomeCategoria(String nomeCategoria);

    Categoria findByNomeCategoria(String nomeCategoria);
}