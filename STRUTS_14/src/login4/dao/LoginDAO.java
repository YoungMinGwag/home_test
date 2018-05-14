package login4.dao;

public class LoginDAO {

	public boolean loginChk(String id, String pwd) {
		if("1".equals(id)) {
			return true;
		}else {
			return false;
		}
	}
}
