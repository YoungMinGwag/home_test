package servletConfig.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import servletConfig.dao.LoginDAO;
import servletConfig.model.UserInfo;

public class LoginAction implements Action,Preparable,ModelDriven,SessionAware,ServletRequestAware,RequestAware{

	UserInfo userInfo;
	LoginDAO dao;
	Map sessionMap;
	Map requestMap;
	HttpServletRequest request;
	Log log=LogFactory.getLog(LoginAction.class);
	

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return userInfo;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		userInfo=new UserInfo();
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("test ID : "+userInfo.getId());
		System.out.println("test  PWD :"+userInfo.getPwd());

		//dao.loginChk(userInfo) // <-- null °ª ³ª¿È 
		if(userInfo.getId().equals("1")) {
			userInfo.setName("È«±æµ¿");
			
			sessionMap.put("userInfo", userInfo);
			log.info(">>>>>> requestURI : " + request.getRequestURI());
			log.info(">>>>>> request ID : " + requestMap.get("id").toString());
			log.info(">>>>>> request PWD : " + requestMap.get("pwd").toString());
			return SUCCESS;

		}else {
			return LOGIN;
		
		}
	}
	
	public void setLoginDAO(LoginDAO loginDAO) {
		
		this.dao=loginDAO;
		
	}
	public void setSession(Map session) {
		this.sessionMap=session;
	}

	
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}

	@Override
	public void setRequest(Map requestMap) {
		// TODO Auto-generated method stub
		this.requestMap=requestMap;
	}
}
