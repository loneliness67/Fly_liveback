package com.flyl.liveback.Pojo;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/* 
* 
* gen by beetlsql 2018-04-19
*/
public class FlyliveShowcase  {
	
	private Integer id ;
	private Integer liveId ;
	private Date createTime ;
	private Date updateTime ;
	
	public FlyliveShowcase() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getLiveId(){
		return  liveId;
	}
	public void setLiveId(Integer liveId ){
		this.liveId = liveId;
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
