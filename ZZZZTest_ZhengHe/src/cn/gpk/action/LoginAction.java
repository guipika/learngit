package cn.gpk.action;

import cn.gpk.entity.User;
import cn.gpk.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private User user;
	//private UserDAO userdao;
	private UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	/*public UserDAO getUserdao() {
		return userdao;
	}
	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}*/
	@Override
	public String execute() throws Exception {
		System.out.println("������");
		System.out.println("��¼��Ϊ��"+user.getName());
		System.out.println("���ϴ�СΪ��"+userService.findAll().size());
		return NONE;
	}
}
