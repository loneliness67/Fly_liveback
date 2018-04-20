package com.flyl.liveback.Pojo;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/* 
* 
* gen by beetlsql 2018-04-19
*/
public class FlyliveUser  {
	
	//用户表id
	private Integer id ;
	private Integer liveId ;
	//角色权限
	private Integer role ;
	private Integer sex ;
	//账户状态
	private Integer statuc ;
	private String email ;
	private String image ;
	//用户密码，MD5加密
	private String password ;
	private String phone ;
	//用户名
	private String username ;
	private Date createTime ;
	private Date updateTime ;
	
	public FlyliveUser() {
	}
	
	/**用户表id
	*@return 
	*/
	public Integer getId(){
		return  id;
	}
	/**用户表id
	*@param  id
	*/
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getLiveId(){
		return  liveId;
	}
	public void setLiveId(Integer liveId ){
		this.liveId = liveId;
	}
	
	/**角色权限
	*@return 
	*/
	public Integer getRole(){
		return  role;
	}
	/**角色权限
	*@param  role
	*/
	public void setRole(Integer role ){
		this.role = role;
	}
	
	public Integer getSex(){
		return  sex;
	}
	public void setSex(Integer sex ){
		this.sex = sex;
	}
	
	/**账户状态
	*@return 
	*/
	public Integer getStatuc(){
		return  statuc;
	}
	/**账户状态
	*@param  statuc
	*/
	public void setStatuc(Integer statuc ){
		this.statuc = statuc;
	}
	
	public String getEmail(){
		return  email;
	}
	public void setEmail(String email ){
		this.email = email;
	}
	
	public String getImage(){
		return  image;
	}
	public void setImage(String image ){
		this.image = image;
	}
	
	/**用户密码，MD5加密
	*@return 
	*/
	public String getPassword(){
		return  password;
	}
	/**用户密码，MD5加密
	*@param  password
	*/
	public void setPassword(String password ){
		this.password = password;
	}
	
	public String getPhone(){
		return  phone;
	}
	public void setPhone(String phone ){
		this.phone = phone;
	}
	
	/**用户名
	*@return 
	*/
	public String getUsername(){
		return  username;
	}
	/**用户名
	*@param  username
	*/
	public void setUsername(String username ){
		this.username = username;
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
