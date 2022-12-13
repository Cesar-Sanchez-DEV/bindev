package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IUserService;
import com.example.demo.interfaces.IUser;
import com.example.demo.modelo.User;

@Service
public class UserService implements IUserService{

	@Autowired
	private IUser data;
	
	@Override
	public List<User> listar() {
		return (List<User>)data.findAll();
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
