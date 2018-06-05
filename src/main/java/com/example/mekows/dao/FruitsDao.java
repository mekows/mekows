package com.example.mekows.dao;

import com.example.mekows.entity.Fruits;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
//@Qualifier("sqlSessionFactory")
@Table(name="fruits")
@Qualifier("fruitsDao")
public interface FruitsDao extends CrudRepository<Fruits, Long > {

    public Fruits findOne(Long id);

//    @SuppressWarnings("unchecked")
    public Fruits save(Fruits fruits);


}
