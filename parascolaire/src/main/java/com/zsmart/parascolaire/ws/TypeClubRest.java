package com.zsmart.parascolaire.ws;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsmart.parascolaire.bean.TypeClub;
import com.zsmart.parascolaire.model.facade.TypeClubService;

@Controller
@RequestMapping ("parascolaire/typeClub")
public class TypeClubRest {
	

	@Autowired
	private TypeClubService typeClubService;
	
	@GetMapping("/id/{id}")
	public TypeClub findById(@PathVariable int id) {
		return typeClubService.findById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable int id) {
		return typeClubService.deleteById(id);
	}
	
	@PostMapping("/")
	public void save(@RequestBody TypeClub typeClub) {
		typeClubService.save(typeClub);
		

	}
	@GetMapping("/")
	public List<TypeClub> findAll() {
		return typeClubService.findAll();
	}
	

}
