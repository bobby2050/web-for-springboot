package com.example.demo.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.demo.dao.ProductDao;
import com.example.demo.demo.entity.ProductDetailReEntity;
import com.example.demo.demo.entity.ProductListReEntity;
import com.example.demo.demo.model.ProductModel;
import com.example.demo.demo.service.ProductService;
import com.example.demo.demo.view.QueryLast3ReView;



@Service
public class ProductServiceImpl implements ProductService {

	//private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private ProductDao productDao;

	/**
	 * 列表
	 */
	@Override
    public List<ProductListReEntity> list(){
		
		List<ProductModel> list = productDao.queryList();

		List<ProductListReEntity> data = new ArrayList<>();
		for(ProductModel i : list) {
			ProductListReEntity productListReEntity = new ProductListReEntity();
			productListReEntity.setId(i.getId());
			productListReEntity.setImgUrl(i.getImgUrl());
			productListReEntity.setName(i.getName());
			productListReEntity.setNo(i.getNo());
//			productListReEntity.setCategory(i.getCategory() == null ? 1: i.getCategory().ordinal());
			
			data.add(productListReEntity);
		}

		return data;
	}

	/**
	 * 详情
	 */
	public ProductDetailReEntity detail(Integer id) {
		System.out.println("[detail id]:" + id);
		Optional<ProductModel> optional = productDao.findById(id);
		if (optional == null ) {
			return null;
		}
		ProductModel data = optional.get();
		
		ProductDetailReEntity row = new ProductDetailReEntity();
		row.setDetail(data.getDetail());
		row.setId(data.getId());
		row.setCategory(data.getCategory());
		row.setName(data.getName());
		row.setNo(data.getNo());
		row.setImgUrl(data.getImgUrl());
		row.setFeature(data.getFeature());
	   
		return row;
	}

	/**
	 * 最后三条
	 * @return
	 */
	public List<ProductListReEntity> last3() {
		// Medical Care
		List<QueryLast3ReView> lists = productDao.queryLast3(1);

		List<ProductListReEntity> data = new ArrayList<ProductListReEntity>();
		for(QueryLast3ReView list : lists) {
			ProductListReEntity row = new ProductListReEntity();
			row.setId(list.getId());
			row.setName(list.getName());
			row.setNo(list.getNo());
			row.setImgUrl(list.getImgUrl());
			data.add(row);
		}

		return data;
	}

}
