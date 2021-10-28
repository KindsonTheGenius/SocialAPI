package com.kindsonthegenius.social.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends CrudRepository<Student, String> {
	
	//@Query("SELECT * FROM Student t where t.name = %?1%")
	//public Optional<Student> findNameById(String criteria);
	
}
