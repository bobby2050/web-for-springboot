package com.example.demo.demo.dao;

import java.util.List;


import com.example.demo.demo.model.ProductModel;
import com.example.demo.demo.view.QueryLast3ReView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<ProductModel, Integer>, JpaSpecificationExecutor<ProductModel> {

	@Query(value = "SELECT m FROM ProductModel m ")
	public List<ProductModel> queryList();


	/**
	 * 最后三条
	 * @return
	 */
	@Query(value = "SELECT id, name, no, img_url as 'imgUrl' FROM t_product m  where category=?1 order by m.id desc limit 3",  nativeQuery = true)
	public List<QueryLast3ReView> queryLast3(Integer cateogryId);
}
