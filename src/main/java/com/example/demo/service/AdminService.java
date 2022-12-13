package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IAdminService;
import com.example.demo.interfaces.IAdmin;
import com.example.demo.modelo.Admin;

@Service
public class AdminService implements IAdminService {
	
	@Autowired IAdmin data;

	@Override
	public List<Admin> listar() {
		return (List<Admin>)data.findAll();
	}

}
