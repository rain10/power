function opendialog(options){
			if(options.gridId){
				if(options.gridId && options.checkSelect==true){
					if(!options.queryParams){
						options.queryParams={};
					}
					if(options.gridType=='treegrid'){
						var idField =  jQuery("#"+options.gridId).treegrid('options').idField;
						var row = jQuery("#"+options.gridId).treegrid('getSelected');
						if(!row){
							parent.layer.msg("请选择一行数据",{icon:7,time:3000});
							return ;
						}
						//options.queryParams.id=row[idField];
						options.queryParams[idField]=row[idField];
					}else{
						var idField =  jQuery("#"+options.gridId).datagrid('options').idField;
						var row = jQuery("#"+options.gridId).datagrid('getSelected');
						if(!row){
							parent.layer.msg("请选择一行数据",{icon:7,time:3000});
							return ;
						}
						options.queryParams[idField]=row[idField];
					}
				}
			}
			var dialog = document.createElement('div');
			dialog.style.cssText += " padding:10px 20px ";
			dialog.setAttribute("custom", "arain-dialog");
	        window.top.document.body.appendChild(dialog);
	        window.top.jQuery(dialog).dialog({
	        	width:options.width||'90%',
	        	height:options.height||'90%',
				title:options.title,
				modal:true,
				draggable:true,
				resizable:false,
				collapsible:true,
				minimizable:false,
				maximizable:true,
				//iconCls:'icon-grid',
				method:options.type||'post',
				href : options.url,	
				queryParams:options.queryParams,
				onBeforeDestroy:function(){
				}
				,onBeforeClose:function(){
					var frame = jQuery('iframe', this);
					if(frame.length>0){
		                try{//跨域会拒绝访问，这里处理掉该异常   
		                	frame[0].contentWindow.document.write('');
		                    frame[0].contentWindow.close();
		                }catch(e){
		                    //Do nothing   
		                }
		                frame.remove();
		                //IE9以上支持，ie6、7、8使用$.browser.msie
		                try{
		                	 if(jQuery.support.msie){
		                         CollectGarbage();
		                     }
		                }catch(e){
		                	if (window.CollectGarbage){
		                		CollectGarbage();
		                	}
		                }
			        }
				    window.top.jQuery(dialog).dialog('destroy');
					return true;
				}
				,onClose:options.onClose||function(){
				}
				,extractor: function(data){
					var pattern = /<body[^>]*>((.|[\n\r])*)<\/body>/im;
 					var matches = pattern.exec(data);
 					if (matches){
 						return matches[1];	// 仅提取主体内容
 					} else {
 						try{
 							dataJson = jQuery.parseJSON(data);
 							parent.layer.msg(dataJson.errorMessage,{icon:5,time:3000});
 							window.top.jQuery(dialog).dialog('close');
 						}catch(e){
 							
 						}
 					}
				}
			});
		}



function openNoClose(options){
	if(options.gridId){
		if(options.gridId && options.checkSelect==true){
			if(!options.queryParams){
				options.queryParams={};
			}
			if(options.gridType=='treegrid'){
				var idField =  jQuery("#"+options.gridId).treegrid('options').idField;
				var row = jQuery("#"+options.gridId).treegrid('getSelected');
				if(!row){
					parent.layer.msg("请选择一行数据",{icon:7,time:3000});
					return ;
				}
				//options.queryParams.id=row[idField];
				options.queryParams[idField]=row[idField];
			}else{
				var idField =  jQuery("#"+options.gridId).datagrid('options').idField;
				console.log(idField)
				var row = jQuery("#"+options.gridId).datagrid('getSelected');
				if(!row){
					parent.layer.msg("请选择一行数据",{icon:7,time:3000});
					return ;
				}
				options.queryParams[idField]=row[idField];
			}
		}
	}
	var dialog = document.createElement('div');
	dialog.style.cssText += " padding:10px 20px ";
	dialog.setAttribute("custom", "arain-dialog");
    window.top.document.body.appendChild(dialog);
    window.top.jQuery(dialog).dialog({
    	width:options.width||'90%',
    	height:options.height||'90%',
		title:options.title,
		modal:true,
		draggable:false,
		resizable:false,
		collapsible:false,
		minimizable:false,
		maximizable:false,
		openAnimation:'show',
		method:options.type||'post',
		href : options.url,	
		queryParams:options.queryParams,
		onBeforeDestroy:function(){
		}
		,onBeforeClose:function(){
			var frame = jQuery('iframe', this);
			if(frame.length>0){
                try{//跨域会拒绝访问，这里处理掉该异常   
                	frame[0].contentWindow.document.write('');
                    frame[0].contentWindow.close();
                }catch(e){
                    //Do nothing   
                }
                frame.remove();
                //IE9以上支持，ie6、7、8使用$.browser.msie
                try{
                	 if(jQuery.support.msie){
                         CollectGarbage();
                     }
                }catch(e){
                	if (window.CollectGarbage){
                		CollectGarbage();
                	}
                }
	        }
		    window.top.jQuery(dialog).dialog('destroy');
			return true;
		}
		,onClose:options.onClose||function(){
		}
		,extractor: function(data){
			var pattern = /<body[^>]*>((.|[\n\r])*)<\/body>/im;
				var matches = pattern.exec(data);
				if (matches){
					return matches[1];	// 仅提取主体内容
				} else {
					try{
						dataJson = jQuery.parseJSON(data);
						parent.layer.msg(dataJson.errorMessage,{icon:5,time:3000});
						window.top.jQuery(dialog).dialog('close');
					}catch(e){
						
					}
				}
		}
	});
}


function openSelects(options){
	if(options.gridId){
		if(options.gridId && options.checkSelect==true){
			var arr =new Array();
			if(!options.queryParams){
				options.queryParams={};
			}
			if(options.gridType=='treegrid'){
				var idField =  jQuery("#"+options.gridId).treegrid('options').idField;
				var row = jQuery("#"+options.gridId).treegrid('getSelections');
				if(row.length == 0 || row==null){
					parent.layer.msg("请选择一行或多行数据",{icon:7,time:3000});
					return ;
				}
				for (var i=0;i<row.length;i++){
					arr.push(row[i][idField]);
				}
				options.queryParams[idField]=arr.toString();
			}else{
				var idField =  jQuery("#"+options.gridId).datagrid('options').idField;
				var row = jQuery("#"+options.gridId).datagrid('getSelections');
				if(row.length == 0 || row==null){
					parent.layer.msg("请选择一行或多行数据",{icon:7,time:3000});
					return ;
				}
				for (var i=0;i<row.length;i++){
					arr.push(row[i][idField]);
				}
				
				options.queryParams[idField]=arr.toString();
			}
		}
	}
	var dialog = document.createElement('div');
	dialog.style.cssText += " padding:10px 20px ";
	dialog.setAttribute("custom", "arain-dialog");
    window.top.document.body.appendChild(dialog);
    window.top.jQuery(dialog).dialog({
    	width:options.width||'90%',
    	height:options.height||'90%',
		title:options.title,
		modal:true,
		draggable:true,
		resizable:false,
		collapsible:true,
		minimizable:false,
		maximizable:true,
		//iconCls:'icon-grid',
		method:options.type||'post',
		href : options.url,	
		queryParams:options.queryParams,
		onBeforeDestroy:function(){
		}
		,onBeforeClose:function(){
			var frame = jQuery('iframe', this);
			if(frame.length>0){
                try{//跨域会拒绝访问，这里处理掉该异常   
                	frame[0].contentWindow.document.write('');
                    frame[0].contentWindow.close();
                }catch(e){
                    //Do nothing   
                }
                frame.remove();
                //IE9以上支持，ie6、7、8使用$.browser.msie
                try{
                	 if(jQuery.support.msie){
                         CollectGarbage();
                     }
                }catch(e){
                	if (window.CollectGarbage){
                		CollectGarbage();
                	}
                }
	        }
		    window.top.jQuery(dialog).dialog('destroy');
			return true;
		}
		,onClose:options.onClose||function(){
		}
		,extractor: function(data){
			var pattern = /<body[^>]*>((.|[\n\r])*)<\/body>/im;
				var matches = pattern.exec(data);
				if (matches){
					return matches[1];	// 仅提取主体内容
				} else {
					try{
						dataJson = jQuery.parseJSON(data);
						parent.layer.msg(dataJson.errorMessage,{icon:5,time:3000});
						window.top.jQuery(dialog).dialog('close');
					}catch(e){
						
					}
				}
		}
	});
}


function closedialog(option) {
	jQuery(option).parents("div[custom='arain-dialog']").dialog('close');
	return false;
}

function break_save() {
	parent.layer.msg("保存成功",{icon:1,time:3000});
	jQuery('.panel-body.panel-body-noborder.window-body').panel('refresh');
}
