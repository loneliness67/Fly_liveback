sample
===
* 注释

	select #use("cols")# from flylive_showcase  where  #use("condition")#

cols
===
	id,live_id,create_time,update_time

updateSample
===
	
	id=#id#,live_id=#liveId#,create_time=#createTime#,update_time=#updateTime#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
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
	
	