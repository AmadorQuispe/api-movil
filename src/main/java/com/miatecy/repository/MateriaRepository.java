package com.miatecy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miatecy.entity.Materia;
@Repository
public interface MateriaRepository extends JpaRepository<Materia, Integer> {

}
