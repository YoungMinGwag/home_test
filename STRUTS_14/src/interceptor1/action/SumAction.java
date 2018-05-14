package interceptor1.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import interceptor1.dao.SumDAO;
import interceptor1.model.NumberForAdd;

public class SumAction implements Action,Preparable,ModelDriven{
	
	NumberForAdd num;
	private int sum=0;
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return num;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
		num=new NumberForAdd();
		
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		SumDAO dao =new SumDAO();
		sum=dao.add(num);
		
		return SUCCESS;
	}
	
	public int getSum() {
		return sum;
	}

}
