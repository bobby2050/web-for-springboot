package com.example.demo.demo.entity;

import java.io.Serializable;

public class ProductListReEntity  implements Serializable {


	private static final long serialVersionUID = -3901071629978381840L;

	private  Integer id;
    
    private String name;

    private String no;

    private String imgUrl;
    
    private int category;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
	
}
