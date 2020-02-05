package com.test.valid.repositories;
import org.springframework.data.repository.CrudRepository;
import com.test.valid.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends BaseRepository<Users,Long>{



}
