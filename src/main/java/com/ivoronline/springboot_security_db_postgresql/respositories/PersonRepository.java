package com.ivoronline.springboot_security_db_postgresql.respositories;

import com.ivoronline.springboot_security_db_postgresql.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
