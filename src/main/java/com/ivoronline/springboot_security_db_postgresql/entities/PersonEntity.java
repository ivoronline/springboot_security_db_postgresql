package com.ivoronline.springboot_security_db_postgresql.entities;

import lombok.Data;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Component
public class PersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

}
