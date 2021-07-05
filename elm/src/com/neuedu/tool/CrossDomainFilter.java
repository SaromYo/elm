package com.neuedu.tool;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CrossDomainFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		// 允许跨域请求
        // response.setHeader("Access-Control-Allow-Origin", "*");
		// 允许固定的几个外域URI请求
        String[] arrAllowedDomain = {"http://localhost:8080","http://localhost:8082"};
        Set<String> setAllowOrigin = new HashSet<String>(Arrays.asList(arrAllowedDomain));
        String origin = request.getHeader("Origin");
        System.out.println("--------->origin:"+origin+"<---------");
        boolean isPass = setAllowOrigin.contains(origin);
        System.out.println("--------->isPass:"+isPass+"<---------");
        if(isPass){
        	/**
        	 * 指定了允许访问该资源的外域URI(请求协议、域名或IP、端口三者的组合)。
        	 * 对于不需要携带身份凭证的请求，服务器可以指定该字段的值为通配符，表示允许来自所有域的请求。 
        	 */
        	response.setHeader("Access-Control-Allow-Origin", origin);
        	// 指明了实际请求所允许使用的 HTTP 方法。如"POST, GET, OPTIONS, DELETE, HEAD"
        	response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, HEAD");
        	// 指明了实际请求中允许携带的首部字段。如"access-control-allow-origin, authority, content-type, version-info, X-Requested-With"
        	response.setHeader("Access-Control-Allow-Headers", "access-control-allow-origin, authority, content-type, version-info, X-Requested-With");
        	/**
        	 * 指定了当浏览器的credentials设置为true时是否允许浏览器读取response的内容。
        	 * 当用在对preflight预检测请求的响应中时，它指定了实际的请求是否可以使用credentials。
        	 * 请注意：简单 GET 请求不会被预检；如果对此类请求的响应中不包含该字段，这个响应将被忽略掉，并且浏览器也不会将相应内容返回给网页。 
        	 */
        	response.setHeader("Access-Control-Allow-Credentials", "true");
        	/**
        	 *  指定了preflight(预检)请求的结果能够被缓存多久，单位为秒。
        	 *  0表示每次异步请求都发起预检请求；3600表示隔60分钟才发起预检请求。
        	 */
        	response.setHeader("Access-Control-Max-Age", "3600");
            
        }
        
        arg2.doFilter(arg0, arg1);
	}

}
