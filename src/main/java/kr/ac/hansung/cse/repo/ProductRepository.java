package kr.ac.hansung.cse.repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	// findById는 이미 구현되어 있는듯
	//
	//List<Product> findAll(); // 얘도 이미 구현되어 있음 딱히 안해도 됨 
	List<Product> findByCategory(String category);
}