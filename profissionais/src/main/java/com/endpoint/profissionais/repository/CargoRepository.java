package com.endpoint.profissionais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endpoint.profissionais.entity.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {


}
