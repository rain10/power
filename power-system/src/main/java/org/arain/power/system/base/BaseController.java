package org.arain.power.system.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("common")
public class BaseController {
	
	@RequestMapping("loadEnabled.do")
	@ResponseBody
	public String loadEnabled() {
		JSONObject object = new JSONObject();
		JSONArray array = new JSONArray();
		object.put("value", 1);
		object.put("text", "是");
		
		JSONObject object1 = new JSONObject();
		object1.put("value", 0);
		object1.put("text", "否");
		
		array.add(object1);
		array.add(object);
		return array.toString();
	}
	
}
