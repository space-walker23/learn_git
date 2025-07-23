package com.login.repo;

import org.springframework.data.repository.CrudRepository;

import com.login.model.User;


public interface UserRepo extends CrudRepository<User, Integer>{

}
