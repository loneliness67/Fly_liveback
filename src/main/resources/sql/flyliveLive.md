sample
===
* 注释

	select #use("cols")# from flylive_live  where  #use("condition")#

cols
===
	id,category_id,name,images,detail,welcome,status,code,create_time,update_time

updateSample
===
	
	id=#id#,category_id=#categoryId#,name=#name#,images=#images#,detail=#detail#,welcome=#welcome#,status=#status#,code=#code#,create_time=#createTime#,update_time=#updateTime#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(categoryId)){
	 and category_id=#categoryId#
	@}
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(images)){
	 and images=#images#
	@}
	@if(!isEmpty(detail)){
	 and detail=#detail#
	@}
	@if(!isEmpty(welcome)){
	 and welcome=#welcome#
	@}
	@if(!isEmpty(status)){
	 and status=#status#
	@}
	@if(!isEmpty(code)){
	 and code=#code#
	@}
	@if(!isEmpty(createTime)){
	 and create_time=#createTime#
	@}
	@if(!isEmpty(updateTime)){
	 and update_time=#updateTime#
	@}
	
	