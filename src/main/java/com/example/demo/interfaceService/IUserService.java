package com.example.demo.interfaceService;

import java.util.List;

import com.example.demo.modelo.User;

public interface IUserService {
	public List<User>listar();
	public void delete(int id);
}
