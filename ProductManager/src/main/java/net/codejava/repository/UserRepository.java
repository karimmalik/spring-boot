package net.codejava.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import net.codejava.model.Users;

public interface UserRepository extends CrudRepository<Users, Long>{
	
	@Query("SELECT u FROM Users u WHERE u.email = ?1")
	public Users findByEmail(String email);
}
