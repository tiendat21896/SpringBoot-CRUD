package com.example.demo001.reponsitory;


import com.example.demo001.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    //biz method
}