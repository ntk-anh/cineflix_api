package com.cybersoft.cineflix_api.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.cineflix_api.entity.Phim;
import com.cybersoft.cineflix_api.repository.PhimRepository;

@Service
@Transactional
public class PhimService implements PhimServiceImp {

	@Autowired
	PhimRepository phimRepository;
	
	/*
	@Override
	public List<Phim> getAllPhim() {
		return phimRepository.findAll();
	}
	*/
	
	@Override
	public List<Map<String, ?>> getAllPhim() {
		return phimRepository.getPhimWithCategory();
	}


	@Override
	public List<Map<String, ?>> getPhimByQuocGia(Integer id) {
		return phimRepository.getPhimByQuocGia(id);
	}


	


	

}
