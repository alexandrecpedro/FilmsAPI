package com.digitalhouse.FilmsAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalhouse.FilmsAPI.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {
}
