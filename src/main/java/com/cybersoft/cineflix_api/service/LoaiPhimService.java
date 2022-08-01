package com.cybersoft.cineflix_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.cineflix_api.entity.LoaiPhim;
import com.cybersoft.cineflix_api.repository.LoaiPhimRepository;
@Service
public class LoaiPhimService implements LoaiPhimServiceImp {

	@Autowired
	LoaiPhimRepository loaiPhimRepository;
	
	@Override
	public List<LoaiPhim> getAllLoaiPhim() {
		return loaiPhimRepository.findAll();
	}

}
