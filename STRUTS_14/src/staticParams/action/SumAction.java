package staticParams.action;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.config.entities.Parameterizable;

import staticParams.dao.SumDAO;
import staticParams.model.NumberForAdd;

public class SumAction implements Action,Parameterizable{

	NumberForAdd num;
	private int sum =0;
	
	Map<String, Object> params;
	
	
	@Override
	public void addParam(String name, Object value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Map<String, Object> getParams() {
		// TODO Auto-generated method stub
		return params;
	}

	@Override
	public void setParams(Map<String, Object> params) {
		// TODO Auto-generated method stub
		this.params=params;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		num=new NumberForAdd();
		num.setNum1(params.get("num1").toString());
		num.setNum2(params.get("num2").toString());
		SumDAO dao=new SumDAO();
		sum=dao.add(num);
		return SUCCESS;
	}

	public int getSum() {
		return sum;
	}
}
