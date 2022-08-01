package com.cybersoft.cineflix_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cybersoft.cineflix_api.entity.LoaiPhim;


public interface LoaiPhimServiceImp {

	List<LoaiPhim> getAllLoaiPhim();
}
