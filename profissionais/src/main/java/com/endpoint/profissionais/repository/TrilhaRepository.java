package com.endpoint.profissionais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endpoint.profissionais.entity.Trilha;

@Repository
public interface TrilhaRepository extends JpaRepository<Trilha, Integer> {

}
