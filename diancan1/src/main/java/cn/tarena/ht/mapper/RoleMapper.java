package cn.tarena.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.tarena.ht.pojo.Role;

public interface RoleMapper {
	
	@Select("select * from role_p ")
	public List<Role> findAll();

	public void saveRole(Role role);
    
	@Select("select role_id from role_user_p where user_id=#{userId}")
	public List<String> findRoleIdByUserId(String userId);
     
	@Select("select module_id from role_module_p where role_id=#{roleId}")
	public List<String> findRoleModuleList(String roleId);
   
	@Delete("delete from role_module_p where role_id=#{roleId}")
	public void deleteRoleModule(String roleId);
    
	@Insert("insert into role_module_p values(#{moduleId},#{roleId})")
	public void saveRoleModule(@Param("roleId")String roleId, @Param("moduleId")String moduleId);
    
	@Select("select * from role_p where role_id=#{roleId}")
	public Role findRoleById(String roleId);
    
	public void updateRole(Role role);

	public void deleteRolesModule(String[] roleIds);

	public void deleteRole(String[] roleIds);

}
