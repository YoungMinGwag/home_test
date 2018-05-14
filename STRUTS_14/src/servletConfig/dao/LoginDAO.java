package servletConfig.dao;

import servletConfig.model.UserInfo;

public class LoginDAO {

	public boolean loginChk(UserInfo userInfo) {
		System.out.println("DAOaaa"+userInfo);
		if("1".equals(userInfo.getId())) {
			userInfo.setName("ȫ�浿");
			return true;
		}else {
			return false;
		}
	}
}
