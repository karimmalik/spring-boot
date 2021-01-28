package net.codejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codejava.model.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long>{

}