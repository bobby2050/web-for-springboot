package com.example.demo.demo.model;

import com.example.demo.demo.constant.SystemDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "t_product")
public class ProductModel extends BaseModel {
    private static final long serialVersionUID = -8336224054833638316L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11)
    private  Integer id;
    
    @Column(name = "category", length = 2)
    private Integer category;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "no", length = 50)
    private String no;

    @Column(name = "img_url", length = 150)
    private String imgUrl;
    
    @Column(name = "feature", length = 5000)
    private String feature;
    
    @Column(name = "detail", length = 5000)
    private String detail;
    
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

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

  
}
