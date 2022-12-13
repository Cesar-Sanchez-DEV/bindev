package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.IAdminService;
import com.example.demo.interfaceService.IUserService;
import com.example.demo.modelo.Admin;
import com.example.demo.modelo.User;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IUserService service;
	
	@Autowired
	private IAdminService servicio;
	
	@GetMapping("")
	public String login(Model model) {
		return "login";
	}
	
	@GetMapping("index")
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping("/users")
	public String usuarios(Model model) {
		List<User>usuarios=service.listar();
		model.addAttribute("auth_user", usuarios);
		return "usuarios";
	}
	
	@GetMapping("/admin")
	public String admin(Model model) {
		List<Admin>admin=servicio.listar();
		model.addAttribute("auth_admin", admin);
		return "admin";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/users";
	}
	
	@GetMapping("/detalles/{id}")
	public String detalles(@PathVariable int id, Model model) {
		List<User>usuarios=service.listar();
		model.addAttribute("auth_user", usuarios);
		return "detalles";
	}
	

}
