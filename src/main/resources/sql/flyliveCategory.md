sample
===
* 注释

	select #use("cols")# from flylive_category  where  #use("condition")#

cols
===
	id,name,create_time,update_time

updateSample
===
	
	id=#id#,name=#name#,create_time=#createTime#,update_time=#updateTime#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(createTime)){
	 and create_time=#createTime#
	@}
	@if(!isEmpty(updateTime)){
	 and update_time=#updateTime#
	@}
	
	