package checkbox.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import checkbox.model.User;

public class CheckBoxAction implements Action,Preparable,ModelDriven{

	User user;
	Log log=LogFactory.getLog(CheckBoxAction.class);
	
	
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		user=new User();
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		log.info(">>> male   :  "+user.getMale() );
		log.info(">>> female :  "+ user.getFemale());
		return SUCCESS;
	}

}
