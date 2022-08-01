package com.cybersoft.cineflix_api.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="chitietphim")
public class ChiTietPhim {

	@Id
	@GeneratedValue
	private long id;
	
	//khóa ngoại
	@ManyToOne 
	@JoinColumn(name = "id_phim")
	private Phim phim;
	
	@Column(name = "tap")
	private String tap;
	
	@Column(name = "link_phim")
	private String linkPhim;

	//hàm get,set
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Phim getPhim() {
		return phim;
	}

	public void setPhim(Phim phim) {
		this.phim = phim;
	}

	public String getTap() {
		return tap;
	}

	public void setTap(String tap) {
		this.tap = tap;
	}

	public String getLinkPhim() {
		return linkPhim;
	}

	public void setLinkPhim(String linkPhim) {
		this.linkPhim = linkPhim;
	}
}
