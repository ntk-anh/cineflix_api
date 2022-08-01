package com.cybersoft.cineflix_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.cineflix_api.entity.Phim;
import com.cybersoft.cineflix_api.service.PhimServiceImp;

@RestController
@RequestMapping("/phim")
public class PhimController {

	@Autowired
	PhimServiceImp phimServiceImp;
	
	@GetMapping("")
	public ResponseEntity<?> getAllPhim(){
		return new ResponseEntity<List<Phim>>(phimServiceImp.getAllPhim(),HttpStatus.OK);
	}
}
