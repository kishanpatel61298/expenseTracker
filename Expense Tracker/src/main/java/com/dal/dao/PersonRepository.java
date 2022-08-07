package com.dal.dao;

import com.dal.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person,Integer> {
    public Person findByPersonId(Integer id);

}
