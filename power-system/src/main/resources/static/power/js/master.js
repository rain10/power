(function($){
	"use strict";
	function layout(){
		$('.theme-console').panel('resize',{
			width: "100%",
			height: ($(window).height()-50)+"px"
		});
		$(".theme-left-menu").css({ height:($(window).height()-70)+"px"});
	}
	$(function(){

		var consoled=$('.theme-console').panel({border:false});
//		$(".theme-left-menu dl").each(function(){
//		    var obj=$(this).find("dt");
//		    var list=$(this).find("dd ul");
//		    var icons=obj.attr("icons");
//			if(typeof(icons)!="undefined"){
//				obj.html(obj.html()+"<div class='iconcode'>"+icons+"</div>");
//			}
//			/*
//			$(this).find("dd ul li").each(function(){
//				var li=$(this);
//				var li_icons=li.attr("icons");
//				if(typeof(li_icons)!="undefined"){
//					li.html(li.html()+"<div class='iconcode'>"+icons+"</div>");
//				}
//			});
//			*/
//		    
//		});

		layout();
		$(window).resize(function() {
			layout();
		});
		$('.theme-header-navigate-combobox').each(function(){ $(this).combo('panel').panel({cls:"theme-header-navigate-combobox-panel"});});
		
		var theme_left_menu_switch=true;
		$(".theme-left-menu,.theme-inside-left-menu").on("click","dl dt",function(event) {
			if(theme_left_menu_switch){
				var node=$(this).next("dd");
				var dt=node.prev("dt");
				var li=node.find("ul li");
				if(node.is(":hidden")){
					(li.hasClass("hover")?dt.removeClass('hover'):"");
		       		node.show();
				}else{
					(li.hasClass("hover")?dt.addClass('hover'):"");
				    node.hide();
				}
			}
		});

		$(document).on("mouseover",".theme-left-indent-menu dl dt",function(event) {

			$(".theme-left-indent-menu dl dt").removeClass("active");
			$(".theme-left-indent-menu-panel").remove();

			var _this_=$(this);
			
			if(!theme_left_menu_switch){
				var node=$(this).next("dd");
				var ul=node.find("ul");
				if(ul.length > 0){
					_this_.addClass("active");
					if($(".theme-left-indent-menu-panel").length==0){
						$("body").append("<div class='theme-left-indent-menu-panel'><ul>"+ul.html()+"</ul></div>");
						$(".theme-left-indent-menu-panel").css({
							top: _this_.offset().top+"px"
						});
					}
				}
			}
		});
		$(document).on("mouseout",".theme-left-indent-menu-panel",function(event) {
			$(".theme-left-indent-menu dl dt").removeClass("active");
			$(".theme-left-indent-menu-panel").remove();
		});

		$(".theme-left-menu-switch").on('click',function(event) {
			if(theme_left_menu_switch){
				
				console.log(theme_left_menu_switch)
				$(".theme-left-menu dl dt").removeClass("hover");
				$(".theme-left-menu dl dd").hide();

				$(".theme-left-layout").css({ width:"49px"});
				$(".theme-right-layout").css({ left:"50px"});

				$(".theme-left-logo").addClass('theme-left-mini-logo');
				$(".theme-left-menu").addClass('theme-left-indent-menu');
				
				var witdh = $(window).width()-49;
    			$('#containerCenter').panel({
    				width:witdh+'px'
    			})

				$(".theme-left-menu dl").each(function(){
				    var obj=$(this).find("dt");
				    var list=$(this).find("dd ul");
				    var icons=obj.attr("icons");
					if(typeof(icons)!="undefined"){
						var x = obj.html().indexOf('</i>');
						var render;
						if(x>0) {
							render = obj.html().substring(x+4,obj.html().length);
						} else {
							render = obj.html();
						}
						obj.html(render+"<div class='iconcode'>"+icons+"</div>");
					}
				});
				
				theme_left_menu_switch=false;
			}else{
				$(".theme-left-menu dl dd").show();

				$(".theme-left-layout").css({ width:"199px"});
				$(".theme-right-layout").css({ left:"200px"});

				$(".theme-left-logo").removeClass('theme-left-mini-logo');
				$(".theme-left-menu").removeClass('theme-left-indent-menu');
				
				var witdh = $(window).width()-199;
				$('#containerCenter').panel({
    				width:witdh+'px'
    			})
				
				$(".theme-left-menu dl").each(function(){
				    var obj=$(this).find("dt");
				    var list=$(this).find("dd ul");
				    var icons=obj.attr("icons");
					if(typeof(icons)!="undefined"){
						var x = obj.html().indexOf('<div');
						var render;
						if(x>0) {
							render = obj.html().substring(0,x);
						} else {
							render = obj.html();
						}
						obj.html("<i class='iconfont'>"+icons+"</i>"+render);
					}
				});
				
				theme_left_menu_switch=true;
			}
			layout();
			
		});

		function menu_event(obj,event){

			$(".theme-left-menu *").removeClass('hover');
			obj.addClass('hover');


			
			var href=obj.attr("href");
			if(typeof(href)!="undefined"){
				/*console.log(href);*/
				consoled.panel({href:href});
			}
			

		};

		$(".theme-left-menu").on("click","dl dt",function(event) {
			var t=$(this);
			(!t.next("dd").find("ul li").length > 0?menu_event(t,event):"");
		});
		$(".theme-left-menu").on("click","dl dd ul li",function(event) {
			menu_event($(this),event);
		});
		

	});
})(jQuery);