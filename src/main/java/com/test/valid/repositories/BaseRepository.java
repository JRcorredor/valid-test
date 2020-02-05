package com.test.valid.repositories;


import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository <T , ID extends Serializable> extends Repository<T,ID> {


// se agregan lo metodos que se van a usar , no metodos innecesarios
    List<T> findAll();

    Optional<T> findById(ID id);

     T save(T persisted) ;

}
