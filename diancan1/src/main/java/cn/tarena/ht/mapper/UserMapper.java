package cn.tarena.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import cn.tarena.ht.pojo.User;

public interface UserMapper {
	
	public List<User> findAll();

	public void deleteUsers(String[] userIds);

	public void updateState(@Param("userIds")String[] userIds, @Param("state")int state);

	public void saveUser(User user);

	public User findUserById(String userId);

	public void updateUser(User user);
    
	@Insert("insert into role_user_p(role_id,user_id) values(#{roleId},#{userId})")
	public void saveUserRole(@Param("userId")String userId, @Param("roleId")String roleId);
    
	@Delete("delete from role_user_p where user_id=#{userId}")
	public void deleteUserRoleById(String userId);

	public User findUserByUP(@Param("userName")String userName, @Param("password")String password);

	public User findUserByUserName(String userName);

	public List<String> findpListByUserId(String userId);
	

}
