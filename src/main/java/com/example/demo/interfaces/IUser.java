package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.User;

@Repository
public interface IUser extends CrudRepository<User, Integer> {

}