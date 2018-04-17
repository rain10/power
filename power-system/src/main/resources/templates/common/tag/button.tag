
@ var typeClass = "";
@ var icon;
@if(isEmpty(type)){
@   typeClass = "button-purple";
@}
@if(type == 'add') {
@  typeClass = "button-yellow";
@}
@if(type == 'edit') {
@  typeClass = "button-blue" ;
@}
@if(type == 'refresh') {
@  typeClass = "button-purple" ;
@}
@if(type == 'save') {
@  typeClass = "button-orange" ;
@}
@if(type == 'close') {
@  typeClass = "button-white" ;
@}
@if(isEmpty(icon) && type == 'add') {
@  icon = "&#xe6e1;";
@}
@if(isEmpty(icon) && type == 'edit') {
@  icon = "&#xe6e5;";
@}
@if(isEmpty(icon) && type == 'refresh') {
@  icon = "&#xe71e;";
@}
@if(isEmpty(icon) && type == 'edit') {
@  icon = "&#xe6e5;";
@}
@if(isEmpty(icon) && type == 'refresh') {
@  icon = "&#xe71e;";
@}
@if(isEmpty(icon) && type == 'save') {
@  icon = "&#xe6f3;";
@}
@if(isEmpty(icon) && type == 'close') {
@  icon = "&#xe6f2;";
@}


<a href="javascript:void(0)" onclick="${onclick}" id="${id }" style="margin-left: 0.5%;" class="easyui-linkbutton ${typeClass }">
	<i class="iconfont">${icon }</i>${name }</a>