package com.test.valid.repositories;


import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository <T , ID extends Serializable> extends Repository<T,ID> {



    List<T> findAll();

    List<T> findAllById(List<ID> ids);

     T save(T persisted) ;

}
