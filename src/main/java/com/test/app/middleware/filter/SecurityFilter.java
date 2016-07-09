package com.test.app.middleware.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class SecurityFilter
 */
public class SecurityFilter implements Filter {

	/** all connected user to YourProject */
	private final Map<String, HttpSession> sessions = new HashMap<String, HttpSession>();

	/**
	 * Default constructor.
	 * 
	 * @throws IOException
	 */
	public SecurityFilter() throws IOException{
		//	PropertyHolder.get ....
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// Nothing here.
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession();


		//if (true) {
			//httpResponse.sendRedirect(testLoginPage);
		//} else {
			//chain.doFilter(httpRequest, httpResponse);
		//}

	}


	public void init(final FilterConfig filterConfig) throws ServletException {
		// Nothing here
	}

}
