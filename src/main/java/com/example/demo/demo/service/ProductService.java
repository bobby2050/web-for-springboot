package com.example.demo.demo.service;

import com.example.demo.demo.entity.ProductDetailReEntity;
import com.example.demo.demo.entity.ProductListReEntity;

import java.util.List;


 
public interface ProductService {


	/**
	 * 列表
	 * @return
	 */
	public List<ProductListReEntity> list();
	
	
	/**
	 * 详情
	 * @param id
	 * @return
	 */
	public ProductDetailReEntity detail(Integer id);

	/**
	 * 最后三条
	 * @return
	 */
	public List<ProductListReEntity> last3();



	
	
}
