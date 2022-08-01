package com.cybersoft.cineflix_api.service;

import java.util.List;
import java.util.Map;

import com.cybersoft.cineflix_api.entity.Phim;



public interface PhimServiceImp {

	 List<Phim> getAllPhim();
	 List<Map<String, ?>> getPhimByQuocGia(Integer id);
}
