package cn.tarena.ht.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.UserInfoMapper;
import cn.tarena.ht.mapper.UserMapper;
import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;
import cn.tarena.ht.tool.Md5HashPassword;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public void deleteUsers(String[] userIds) {
		
		userInfoMapper.deleteUserInfos(userIds);
		userMapper.deleteUsers(userIds);
		
	}

	@Override
	public void updateState(String[] userIds, int state) {
		userMapper.updateState(userIds,state);
		
	}

	@Override
	public void saveUser(User user) {
		String id = UUID.randomUUID().toString();
		user.setUserId(id);
		user.setCreateTime(new Date());
		String password = Md5HashPassword.getMd5Hash(user.getPassword(), user.getUserName());
		user.setPassword(password);
		userMapper.saveUser(user);
		
		UserInfo userInfo = user.getUserInfo();
		userInfo.setUserInfoId(id);
		userInfo.setCreateTime(user.getCreateTime());
		userInfoMapper.saveUserInfo(userInfo);
	}

	@Override
	public User findUserById(String userId) {
		return userMapper.findUserById(userId);
	}

	@Override
	public void updateUser(User user) {
		user.setUpdateTime(new Date());
		userMapper.updateUser(user);
		UserInfo userInfo = user.getUserInfo();
		userInfo.setUserInfoId(user.getUserId());
		userInfo.setUpdateTime(user.getUpdateTime());
		userInfoMapper.updateUserInfo(userInfo);
		
	}

	@Override
	public void saveUserRole(String userId, String[] roleIds) {
		for(String roleId:roleIds){
			userMapper.saveUserRole(userId,roleId);
		}
		
		
	}

	@Override
	public void deleteUserRoleById(String userId) {
		userMapper.deleteUserRoleById(userId);
		
	}

	@Override
	public User findUserByUP(String userName, String password) {
		return userMapper.findUserByUP(userName,password);
		
	}

	@Override
	public User findUserByUserName(String userName) {
		
		return userMapper.findUserByUserName(userName);
	}

	@Override
	public List<String> findpListByUserId(String userId) {
		return userMapper.findpListByUserId(userId);
	}
}
