package cdi;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;



public class BasicAction extends ActionSupport implements ServletRequestAware,
ServletResponseAware, ServletContextAware{
	private static final long serialVersionUID = 1L;
	
	public HttpServletRequest request=null;
	
	public HttpServletResponse response=null;
	
	public ServletContext servletContext=null;
	
	public void setServletRequest(HttpServletRequest req) {
		this.request=req;
		
	}
	public void setServletResponse(HttpServletResponse res) {
		this.response=res;
		
	}
	public void setServletContext(ServletContext sc) {
		this.servletContext=sc;
		
	}
}
