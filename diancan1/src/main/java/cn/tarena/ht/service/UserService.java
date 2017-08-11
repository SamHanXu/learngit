package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;

public interface UserService {
	public List<User> findAll();

	public void deleteUsers(String[] userIds);

	public void updateState(String[] userIds, int state);

	public void saveUser(User user);

	public User findUserById(String userId);

	public void updateUser(User user);

	public void saveUserRole(String userId, String[] roleIds);

	public void deleteUserRoleById(String userId);

	public User findUserByUP(String userName, String password);

	public User findUserByUserName(String userName);

	public List<String> findpListByUserId(String userId);

}
