sample
===
* 注释

	select #use("cols")# from flylive_user  where  #use("condition")#

cols
===
	id,username,password,image,sex,email,phone,role,statuc,live_id,create_time,update_time

updateSample
===
	
	id=#id#,username=#username#,password=#password#,image=#image#,sex=#sex#,email=#email#,phone=#phone#,role=#role#,statuc=#statuc#,live_id=#liveId#,create_time=#createTime#,update_time=#updateTime#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(username)){
	 and username=#username#
	@}
	@if(!isEmpty(password)){
	 and password=#password#
	@}
	@if(!isEmpty(image)){
	 and image=#image#
	@}
	@if(!isEmpty(sex)){
	 and sex=#sex#
	@}
	@if(!isEmpty(email)){
	 and email=#email#
	@}
	@if(!isEmpty(phone)){
	 and phone=#phone#
	@}
	@if(!isEmpty(role)){
	 and role=#role#
	@}
	@if(!isEmpty(statuc)){
	 and statuc=#statuc#
	@}
	@if(!isEmpty(liveId)){
	 and live_id=#liveId#
	@}
	@if(!isEmpty(createTime)){
	 and create_time=#createTime#
	@}
	@if(!isEmpty(updateTime)){
	 and update_time=#updateTime#
	@}
	
	
	
getLikeName
===
    select * from flylive_user where username like #'%'+username+'%'#