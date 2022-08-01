package com.cybersoft.cineflix_api.repository;

import java.util.List;
import java.util.Map;

import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cybersoft.cineflix_api.entity.Phim;

@Repository
public interface PhimRepository extends JpaRepository<Phim, Long> {

//	JQL, Native Query
	@Query(value = "call GetPhimByQuocGia(:id)",nativeQuery = true)//true: cho phép viết thuần sql ở value
	List<Map<String, ?>> getPhimByQuocGia(@Param("id") Integer id);//do  dữ liệu query ra k của entity nào nên dùng map, map là 1 dòng trong bảng result, string là kiểu dl của tên cột, value là kiểu dl của map mà nó k xác định nên để ? => map động
	
	
	@Query(value = "call GetPhimWithCategory()",nativeQuery = true)
	List<Map<String,?>> getPhimWithCategory();//cách map động này k cần sửa dù version jpa có tăng 
}
