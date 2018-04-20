package com.flyl.liveback.Pojo;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/* 
* 
* gen by beetlsql 2018-04-19
*/
public class FlyliveLive  {
	
	private Integer id ;
	private Integer categoryId ;
	private Integer status ;
	private String code ;
	private String detail ;
	private String images ;
	private String name ;
	private String welcome ;
	private Date createTime ;
	private Date updateTime ;
	
	public FlyliveLive() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getCategoryId(){
		return  categoryId;
	}
	public void setCategoryId(Integer categoryId ){
		this.categoryId = categoryId;
	}
	
	public Integer getStatus(){
		return  status;
	}
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	public String getCode(){
		return  code;
	}
	public void setCode(String code ){
		this.code = code;
	}
	
	public String getDetail(){
		return  detail;
	}
	public void setDetail(String detail ){
		this.detail = detail;
	}
	
	public String getImages(){
		return  images;
	}
	public void setImages(String images ){
		this.images = images;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	public String getWelcome(){
		return  welcome;
	}
	public void setWelcome(String welcome ){
		this.welcome = welcome;
	}
	
	public Date getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	
	public Date getUpdateTime(){
		return  updateTime;
	}
	public void setUpdateTime(Date updateTime ){
		this.updateTime = updateTime;
	}
	

}
