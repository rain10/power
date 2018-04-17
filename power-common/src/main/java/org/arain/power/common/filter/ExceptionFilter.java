package org.arain.power.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.arain.power.common.utils.ExceptionUtils;
import org.arain.power.common.utils.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

/**
 * 
* <p>Title:ExceptionFilter </p>
* @author Arain
* @date2017年9月6日
 */
public class ExceptionFilter implements Filter{
	private    final Logger logger = LoggerFactory.getLogger(ExceptionFilter. class);  

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			chain.doFilter(request, response);
		} catch (Exception e) {
			this.logger.error("系统错误!!", e);
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;
			response.setContentType("application/json; charset=utf-8");  
			if ("XMLHttpRequest".equals(req.getHeader("X-Requested-With"))) {
				ResultMap result = new ResultMap();
				result.setMsg(ExceptionUtils.catchBaseExceptionMsg(e));
				result.setCode(400);
				res.getWriter().print(JSON.toJSON(result));
			} 	else {
				ResultMap result = new ResultMap();
				result.setMsg(ExceptionUtils.catchBaseExceptionMsg(e));
				result.setCode(400);
				res.getWriter().print(JSON.toJSON(result));
			}
		}
	}

	@Override
	public void destroy() {
	}
}
