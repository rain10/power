var AM = function(){
	return{
		gridSearch:function(options){
			if(!options.gridId){
				toastr.warning('缺少gridId参数','警告');
				return false;
			}
			var data=options.data||[];
			/*if(!data){
				jQuery("#"+options.gridId).datagrid("reload");
				return false;
			}*/
			
			var queryParams =jQuery("#"+options.gridId).datagrid("options").queryParams;
			var filterRules=[];
			var filterRule={};
			var field='';
			var type='';
			var id='';
			var value='';
			var fun='';
			var flag=false;
			for(var i=0;i<data.length;i++){
				filterRule={};
				field='';
				type='';
				id='';
				value='';
				fun='';
				flag=false;
				field=data[i].field;
				if(!field||field==''){
					toastr.warning('data中缺少field参数','警告');
					flag=true;
					break;
				}
				type=data[i].type;
				if(!type||type==''){
					toastr.warning('data中缺少type参数','警告');
					flag=true;
					break;
				}
				id=data[i].id;
				if(!id||id==''){
					toastr.warning('data中缺少id参数','警告');
					flag=true;
					break;
				}
				fun=data[i].fun;
				switch (type) {
				case 'textbox':
					value=jQuery("#"+id).textbox("getValue");
					filterRule.op='contains';
					break;
				case 'combobox':
					value=jQuery("#"+id).combobox("getValue");
					filterRule.op='equal';
					break;
				case 'datebox':
					value=jQuery("#"+id).datebox("getValue");
					filterRule.op='contains';
					break;
				case 'combotree':
					value=jQuery("#"+id).combotree("getValue");
					filterRule.op='equal';
					if(fun){
						filterRule.fun=fun;
					}
					break;
				}
				if(!value||value==''){
					continue;
				}else{
					filterRule.field=field;
					filterRule.value=value;
					filterRules.push(filterRule);
				}
			}
			if(flag){
				return false;
			}
			
			jQuery("#"+options.gridId).datagrid("options").queryParams.filterRules=JSON.stringify(filterRules);
			jQuery("#"+options.gridId).datagrid("reload");
			return false;
		},renderNav:function(url,pid) {
			$.ajax({
				type : 'GET',
				url : url+'/'+pid,
				success : function(data) {
					var nav = JSON.parse(data); 
					var menu = $('#menu');
					menu.empty();
					for (var i = 0; i < nav.length; i++) {
						console.log(nav[i])
						menu.append("<li id='"+nav[i].id+"' onclick='AM.menuOnclick(\""+nav[i].id+"\",\""+nav[i].name+"\",\""+nav[i].url+"\",\""+nav[i].icon+"\",\""+nav[i].pid+"\");' ><i class='iconfont'>&nbsp"+nav[i].icon+"</i>"+nav[i].name+"</li>");
					}
					$.parser.parse(menu)
				}
			})
		},menuOnclick:function(id,name,url,icon,pid) {
			AM.renderData(name,url,id,icon,pid);
		},renderData:function(name,url,id,icon,pid) {
			if(pid != null && pid != '') {
				var pName = $('#'+pid).attr('inames');
				$("#containerCenter").panel('setTitle',"当前位置>>"+pName+">>"+name);
			} else {
				$("#containerCenter").panel('setTitle',"当前位置>>"+name);
			}
			var $body = jQuery("#containerCenter").panel('body');
			AM.createIframe({target:$body,src:url});
		},
		createIframe:function(options){
			var $body = options.target;
            //销毁已有的iframe
            var $frame=jQuery('iframe', $body);
            if($frame.length>0){
                try{//跨域会拒绝访问，这里处理掉该异常   
                    $frame[0].contentWindow.document.write('');
                    $frame[0].contentWindow.close();
                }catch(e){   
                    //Do nothing   
                }
                $frame.remove();
                jQuery('#toast-container').remove();
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
            var iframe = document.createElement("iframe");
            iframe.src = options.src;
            iframe.frameBorder = options.frameBorder || 0;
            iframe.height = options.height || '100%';
            iframe.width = options.width || '100%';
            AM.blockUI({boxed: true,target:$body[0]});
            
            if (iframe.attachEvent){
                iframe.attachEvent("onload", function(){
                	AM.unblockUI({target:$body[0]});
                });
            } else {
                iframe.onload = function(){
                	AM.unblockUI($body[0]);
                };
            }
            $body[0].appendChild(iframe);
            
		},blockUI:function(options) {
		    options = jQuery.extend(true, {}, options);
		    var html = '';
		    if (options.animate) {
		        html = '<div class="loading-message ' + (options.boxed ? 'loading-message-boxed' : '') + '">' + '<div class="block-spinner-bar"><div class="bounce1"></div><div class="bounce2"></div><div class="bounce3"></div></div>' + '</div>';
		    } else if (options.iconOnly) {
		        html = '<div class="loading-message ' + (options.boxed ? 'loading-message-boxed' : '') + '"><img src="/power/images/loading-spinner-grey.gif" align=""></div>';
		    } else if (options.textOnly) {
		        html = '<div class="loading-message ' + (options.boxed ? 'loading-message-boxed' : '') + '"><span>&nbsp;&nbsp;' + (options.message ? options.message : '加载中...') + '</span></div>';
		    } else {
		        html = '<div class="loading-message ' + (options.boxed ? 'loading-message-boxed' : '') + '"><img src="/power/images/loading-spinner-grey.gif" align=""><span>&nbsp;&nbsp;' + (options.message ? options.message : '加载中...') + '</span></div>';
		    }
		    if (options.target) { // element blocking
		        var el = jQuery(options.target);
		        if (el.height() <= (jQuery(window).height())) {
		            options.cenrerY = true;
		        }
		        el.block({
		            message: html,
		            baseZ: options.zIndex ? options.zIndex : 9999,
		            centerY: options.cenrerY !== undefined ? options.cenrerY : false,
		            css: {
		                top: '50%',
		                border: '0',
		                padding: '0',
		                backgroundColor: 'none'
		            },
		            overlayCSS: {
		                backgroundColor: options.overlayColor ? options.overlayColor : '#555',
		                opacity: options.boxed ? 0.05 : 0.1,
		                cursor: 'wait'
		            }
		        });
		    } else { // page blocking
		    	jQuery.blockUI({
		            message: html,
		            baseZ: options.zIndex ? options.zIndex : 9999,
		            css: {
		                border: '0',
		                padding: '0',
		                backgroundColor: 'none'
		            },
		            overlayCSS: {
		                backgroundColor: options.overlayColor ? options.overlayColor : '#555',
		                opacity: options.boxed ? 0.05 : 0.1,
		                cursor: 'wait'
		            }
		        });
		    }
		}
		/**
		 * 关闭遮罩
		 */
		,unblockUI: function(target) {
		    if (target) {
		    	jQuery(target).unblock({
		            onUnblock: function() {
		                jQuery(target).css('position', '');
		                jQuery(target).css('zoom', '');
		            }
		        });
		    } else {
		    	jQuery.unblockUI();
		    }
		}
	}
}(jQuery);