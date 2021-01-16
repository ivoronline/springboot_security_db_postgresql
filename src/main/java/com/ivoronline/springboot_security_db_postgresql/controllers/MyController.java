package com.ivoronline.springboot_security_db_postgresql.controllers;

import com.ivoronline.springboot_security_db_postgresql.entities.PersonEntity;
import com.ivoronline.springboot_security_db_postgresql.respositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired
  PersonEntity personEntity;

  @Autowired
  PersonRepository personRepository;

  @ResponseBody
  @RequestMapping("/addPerson")
  public String addPerson() {

    //CREATE PERSON
    personEntity.setName("John");
    personEntity.setAge(20);

    //STORE PERSON
    personRepository.save(personEntity);

    //RETURN
    return "Person added to DB:" + personEntity.getId();

  }

}

