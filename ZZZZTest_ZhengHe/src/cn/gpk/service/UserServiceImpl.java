package cn.gpk.service;

import java.util.List;

import cn.gpk.entity.User;
import cn.gpk.entity.UserDAO;

public class UserServiceImpl implements UserService {

	private UserDAO userdao;
	
	
	public UserDAO getUserdao() {
		return userdao;
	}


	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}


	@Override
	public List<User> findAll() {
		
		return userdao.findAll();
	}

}
