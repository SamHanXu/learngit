package cn.tarena.ht.mapper;

import java.util.List;

import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;

public interface UserInfoMapper {

	public void deleteUserInfos(String[] userIds);

	public List<UserInfo> findManagerList();

	public void saveUserInfo(UserInfo userInfo);

	public void updateUserInfo(UserInfo userInfo);
	

}
