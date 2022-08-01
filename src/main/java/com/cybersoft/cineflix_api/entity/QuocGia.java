package com.cybersoft.cineflix_api.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="quocgia")
public class QuocGia {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="ten_quocgia")
	private String tenQuocGia;
	
	
	@OneToMany(mappedBy = "quocGia")
	private Set<Phim> phims;

	//hàm get,set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenQuocGia() {
		return tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}

	
	
	
}
