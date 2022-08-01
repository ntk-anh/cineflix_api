package com.cybersoft.cineflix_api.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity(name="phim")
public class Phim {

	@Id
	@GeneratedValue
	private long id;
	
	//khóa ngoại
	@ManyToOne()
	@JoinColumn(name="id_quocgia")
	private QuocGia quocGia;
	
	@OneToMany(mappedBy = "phim")
	private Set<LoaiPhimPhim> loaiPhimPhims;
	
	@OneToMany(mappedBy = "phim")
	private Set<ChiTietPhim> chiTietPhims;

	@Column(name="ten_phim")
	private String tenPhim;
	
	@Column(name="hinh_anh")
	private String hinhAnh;
	
	@Column(name="ngay_tao")
	private Date ngayTao;
	
	@Column(name="mo_ta")
	private String moTa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//	comment để tránh vòng lặp vô tận do map qua map lại => giải pháp xài gson
//	public QuocGia getQuocGia() {
//		return quocGia;
//	}
//
//	public void setQuocGia(QuocGia quocGia) {
//		this.quocGia = quocGia;
//	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
	
	
	
	
	
	
}
