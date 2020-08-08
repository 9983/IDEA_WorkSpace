package com.zking.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CorsFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;

		// Access-Control-Allow-Origin就是我们需要设置的域名
		// Access-Control-Allow-Headers跨域允许包含的头。
		// Access-Control-Allow-Methods是允许的请求方式
		httpResponse.setHeader("Access-Control-Allow-Origin", "*");// *,任何域名
		httpResponse.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE");
/*
		// jwt>>>

		// 允许客户端，发一个新的请求头jwt
		httpResponse.setHeader("Access-Control-Allow-Headers", "Origin,X-Requested-With, Content-Type, Accept, jwt");
		// 允许客户端，处理一个新的响应头jwt
		httpResponse.setHeader("Access-Control-Expose-Headers", "jwt");

		//spa_08报错原因>>>
		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		
		// axios的ajax会发两次请求，第一次提交方式为：option，直接返回即可
		if ("OPTIONS".equals(httpServletRequest.getMethod())) {
			return;
		}
		//spa_08报错原因<<<

		// jwt<<<*/
		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
