package com.cybersoft.cineflix_api.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity(name = "loaiphim")
public class LoaiPhim {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "ten_loai")
	private String tenLoai;
	
	@Column(name = "hinh_anh")
	private String hinhAnh;
	
	@OneToMany(mappedBy = "loaiPhim")
	private Set<LoaiPhimPhim> loaiPhimPhims;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

}
