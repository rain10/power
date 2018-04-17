package org.arain.power.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.shiro.SecurityUtils;
import org.arain.power.common.pojo.system.SysUser;
/**
 * 
* <p>Title:AppUtils </p>
* @author Arain
* @date2017年8月29日
 */
public class AppUtils {
	public static void copyProperties(Object target, Object source) {
		try {
			ConvertUtils.register(new DateConverter(null), java.util.Date.class);  
			BeanUtils.copyProperties(target, source);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	public static Short getUserType() {
		return ((SysUser) SecurityUtils.getSubject().getPrincipal()).getUsertype();
	}
	public static Long getUserId() {
		return ((SysUser) SecurityUtils.getSubject().getPrincipal()).getId();

	}
	public static String getUserName() {
		return ((SysUser) SecurityUtils.getSubject().getPrincipal()).getUsername();
	}
	
	public static String getRealName() {
		return ((SysUser) SecurityUtils.getSubject().getPrincipal()).getRealname();
	}
	
	public static Long getOrgId() {
		return ((SysUser) SecurityUtils.getSubject().getPrincipal()).getOrgid();
	}
	
	public static Long getHead() {
		return ((SysUser) SecurityUtils.getSubject().getPrincipal()).getHead();
	}
	
	public static List<String> load_icons() {
		List<String> iconsList = new ArrayList<>();
		 String[] str = SysResourceIcons.str;
		 for (String string : str) {
			 iconsList.add(string);
		}
		return iconsList;
	}
	
	
	public static String ReadFile(String path){
		String laststr="";
		File file=new File(path);
		BufferedReader reader=null;
		try{
		reader=new BufferedReader(new FileReader(file));
		String tempString=null;
		//int line=1;
		while((tempString=reader.readLine())!=null){
		//System.out.println("line"+line+":"+tempString);
		laststr=laststr+tempString;
		//line++;
		}
		reader.close();
		}catch(IOException e){
		e.printStackTrace();
		}finally{
		if(reader!=null){
		try{
		reader.close();
		}catch(IOException el){
		}  }  }
		return laststr;
		}
}
