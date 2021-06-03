package com.example.demo.dao;

import com.example.demo.eity.Myone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyoneDao extends CrudRepository<Myone,Integer> {


}
