package checkbox.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import chain.dao.MemberDAO;
import chain.model.UserInfo;

public class MemberAction implements Action,Preparable,ModelDriven{

	UserInfo userInfo;
	
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
		MemberDAO dao=new MemberDAO();
		if(dao.save(userInfo)) {
			return SUCCESS;
		}else {
		return LOGIN;
		}
	}
	

}
